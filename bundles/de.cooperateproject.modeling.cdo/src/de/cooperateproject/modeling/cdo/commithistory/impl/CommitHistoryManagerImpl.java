package de.cooperateproject.modeling.cdo.commithistory.impl;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.common.util.URI;
import org.osgi.service.component.annotations.Component;

import de.cooperateproject.modeling.cdo.commithistory.ICommitHistoryManager;
import de.cooperateproject.ui.launchermodel.helper.ConcreteSyntaxTypeNotAvailableException;

@Component
public class CommitHistoryManagerImpl implements ICommitHistoryManager {


	@Override
	public Collection<CDOCommitInfo> getCommitsForLauncher(IFile launcherFile) throws IOException, ConcreteSyntaxTypeNotAvailableException {
		try (AllCommitsForFileFinder commitFinder = new AllCommitsForFileFinder(launcherFile)) {
			return commitFinder.getCommits();
		}
	}

    @Override
    public Collection<CDOCommitInfo> getCommitsForLauncher(IFile launcherFile, long from, long to)
            throws IOException, ConcreteSyntaxTypeNotAvailableException {
        try (AllCommitsFinderBase commitFinder = new AllCommitsForFileFinder(launcherFile)) {
            return commitFinder.getCommitsInTimeRange(from, to);
        }
    }

	@Override
	public Collection<CDOCommitInfo> getCommitsForUMLModel(URI umlModel) throws IOException {
        try (AllCommitsFinderBase commitFinder = new AllCommitsForUMLModelFinder(umlModel)) {
            return commitFinder.getCommits();
        }
	}

}