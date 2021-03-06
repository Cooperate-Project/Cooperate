package de.cooperateproject.ui.nature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.ui.nature.tasks.BackgroundTasksAdapter;

/**
 * IResourceChangeListener which provides custom logic for cooperate projects.
 * 
 * @author faller, seifermann, persch, henss
 *
 */
public class ProjectOpenedListener implements IResourceChangeListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectOpenedListener.class);

    @Override
    public void resourceChanged(IResourceChangeEvent event) {
        if (handleNullOrClosing(event)) {
            return;
        }
        try {
            event.getDelta().accept(new CooperateResourceDeltaVisitor());
        } catch (CoreException e) {
            LOGGER.error("Exception during rebuild after opening or closing of a project", e);
        }
    }

    private static boolean handleNullOrClosing(IResourceChangeEvent event) {
        if (event == null) {
            return true;
        } else if (event.getDelta() == null) {
            if (event.getType() == IResourceChangeEvent.PRE_CLOSE) {
                BackgroundTasksAdapter.getManager().deregisterProject((IProject) event.getResource());
            }
            return true;
        }
        return false;
    }

    private static boolean isRelevantForClean(IResourceDelta delta) {
        if ((delta.getResource().getType() & IResource.PROJECT) != 0 && (delta.getFlags() & IResourceDelta.OPEN) != 0) {
            IProject project = delta.getResource().getAdapter(IProject.class);
            return project.isAccessible();
        }

        return false;
    }

    private static boolean isRelevantForDeregister(IResourceDelta delta) {
        if ((delta.getResource().getType() & IResource.PROJECT) == 0) {
            return false;
        }
        IProject project = delta.getResource().getAdapter(IProject.class);

        if (delta.getKind() == IResourceDelta.REMOVED || !project.isAccessible()) {
            return true;
        }

        return false;
    }

    private static class CooperateResourceDeltaVisitor implements IResourceDeltaVisitor {
        @Override
        public boolean visit(final IResourceDelta delta) throws CoreException {
            if (isRelevantForClean(delta)) {
                IProject project = delta.getResource().getAdapter(IProject.class);
                Job rebuild = new Job("rebuild") {
                    @Override
                    protected IStatus run(IProgressMonitor monitor) {
                        try {
                            project.build(IncrementalProjectBuilder.FULL_BUILD, monitor);
                        } catch (CoreException e) {
                            LOGGER.error("Exception during rebuild after opening of a project", e);
                            return Status.CANCEL_STATUS;
                        }
                        return Status.OK_STATUS;
                    }
                };
                rebuild.schedule();
            }

            if (isRelevantForDeregister(delta)) {
                BackgroundTasksAdapter.getManager().deregisterProject((IProject) delta.getResource());
            }
            return true;
        }
    }
}
