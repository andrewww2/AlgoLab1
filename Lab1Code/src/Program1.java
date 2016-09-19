
/*
 * Name: <your name>
 * EID: <your EID>
 */

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Your solution goes in this class.
 * 
 * Please do not modify the other files we have provided for you, as we will use
 * our own versions of those files when grading your project. You are
 * responsible for ensuring that your solution works with the original version
 * of all the other files we have provided for you.
 * 
 * That said, please feel free to add additional files and classes to your
 * solution, as you see fit. We will use ALL of your additional files when
 * grading your solution.
 */
public class Program1 extends AbstractProgram1 {
	/**
	 * Determines whether a candidate Matching represents a solution to the
	 * Stable Marriage problem. Study the description of a Matching in the
	 * project documentation to help you with this.
	 */
	public boolean isStableMatching(Matching marriage) {
		ArrayList<ArrayList<Integer>> menPref = marriage.getMenPreference();
		ArrayList<Integer> finalMatch = marriage.getWomenMatching();
		/*
		 * 1) iterate thru all matches 2) for each match, look up man and
		 * woman's preferences 3) check if man prefers another woman who prefers
		 * him, and check if woman prefers another man who prefer her 4) if
		 * true, return false (unstable matching). Otherwise true (is stable
		 * matching).
		 */
		// print man's preferences
		System.out.println("==========Men's preferences========");
		for (ArrayList<Integer> onePref : menPref) {
			System.out.println(onePref.toString());
		}

		System.out.println("============Final matches==========");
		for (Integer index : finalMatch) {
			System.out.println(index);
		}
		/* TODO implement this function */
		return false; /* TODO remove this line */
	}

	/**
	 * Determines a solution to the Stable Marriage problem from the given input
	 * set. Study the project description to understand the variables which
	 * represent the input to your solution.
	 * 
	 * @return A stable Matching.
	 */
	public Matching stableMarriageGaleShapley(Matching marriage) {
		/* TODO implement this function */
		return null; /* TODO remove this line */
	}
}
