package de.cooperateproject.ui.diff.labeling;

import org.eclipse.emf.compare.DifferenceKind;

public class DifferenceKindHelper {

	/**
	 * Converts a DifferenceKind to another String representation, a short
	 * token.
	 * 
	 * @param diffKind
	 *            The DifferenceKind to be converted
	 * @return a short String representation of the DifferenceKind
	 */
	public static String convertToToken(DifferenceKind diffKind) {
		String ret;

		switch (diffKind) {
		case ADD:
			ret = "add";
			break;
		case DELETE:
			ret = "del";
			break;
		case MOVE:
			ret = "mov";
			break;
		case CHANGE:
			ret = "cha";
			break;
		default:
			ret = diffKind.toString();
		}

		return ret;
	}

	/**
	 * Converts a DifferenceKind to a written-out String representation.
	 * 
	 * @param diffKind
	 *            The DifferenceKind to be converted
	 * @return a written-out String representation of the DifferenceKind
	 */
	public static String convertToVerbalized(DifferenceKind diffKind) {
		String ret;

		switch (diffKind) {
		case ADD:
			ret = "add";
			break;
		case DELETE:
			ret = "del";
			break;
		case MOVE:
			ret = "mov";
			break;
		case CHANGE:
			ret = "cha";
			break;
		default:
			ret = diffKind.toString();
		}

		return ret;
	}

}