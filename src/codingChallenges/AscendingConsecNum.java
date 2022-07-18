package Challenges;

public class AscendingConsecNum {

	/*-
	 * Problem: Ascending or Ascending AND Consecutive Numbers
	 * 
	 * Write a function that returns true if a string consists of ascending 
	 * or ascending AND consecutive numbers.
	 * 
	 * Examples:
	 * - ascending("232425") --> true
	 * Consecutive numbers 23, 24, 25
	 * 
	 * - ascending("2324256") --> false
	 * No matter how this string is divided, the numbers are not consecutive.
	 * 
	 * - ascending("444445") --> true
	 * Consecutive numbers 444 and 445.
	 * 
	 * Notes:
	 * A number can consist of any number of digits, so long as the numbers 
	 * are adjacent to each other, and the string has at least two of them.
	 */

	public static void main(String args[]) {

//		String input = "232425";
//		String input = "12312";
//		String input = "444445";
//		String input = "12345";
		String input = "012";

		System.out.println(input + " is ascending: " + isAscending(input));
	}

	public static boolean isAscending(String input) {

		Boolean isAscending = false;

		for (int i = 1; i <= input.length() / 2; i++) {

			if (input.length() % i == 0) {

				for (int j = 0; j < input.length() - i; j += i) {

					int currentDgit = Integer.parseInt(input.substring(j, j + i));
					int nextDgit = Integer.parseInt(input.substring(j + i, j + i + i));

					if (currentDgit > nextDgit) {

						break;

					} else if (j + i >= input.length() - i) {

						isAscending = true;
					}
				}
			}
		}

		return isAscending;

	}
}
