package codingChallenges.Java;

import java.util.Scanner;

public class MultiplyBy11 {

	/*-
	 * Problem: Multiply by 11
	 * 
	 * Given a positive number as a string, multiply the number by 11 
	 * and also return it as a string. However, there is a catch:
	 * You are NOT ALLOWED to simply cast the numeric string into an integer!
	 * 
	 * Now, how is this challenge even possible?
	 * Despite this, there is still a way to solve it, and it involves thinking 
	 * about how someone might multiply by 11 in their head. See the tips below for guidance.
	 * 
	 * Examples:
	 * multiplyBy11("11") -> "121"
	 * multiplyBy11("111111111") -> "1222222221"
	 * multiplyBy11("1213200020") -> "13345200220"
	 * multiplyBy11("1217197941") -> "13389177351"
	 * multiplyBy11("9473745364784876253253263723") -> "104211199012633638785785900953"
	 * 
	 * Tip:
	 * There is a simple trick to multiplying any two-digit number by 11 in your head:
	 * Add the two digits together
	 * Place the sum between the two digits!
	 * 
	 * Note if the total goes over, carry the sum on to the next digit 
	 * - 23 * 11
	 * Add together 2 and 3 to make 5
	 * Place 5 between the two digits to make 253
	 * 
	 * - 77 * 11
	 * Add together 7 and 7 to make 14
	 * Place 4 between the two digits to make 747. 
	 * Carry the 1 to make 847
	 */

	public static void main(String arg[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Type value to be multiply by 11 here");

		String stringIn = scanner.next();
		scanner.close();

//		String stringIn = "5555";

		System.out.println(stringIn + " * 11 = " + multiplyBy11(stringIn));
	}

	private static String multiplyBy11(String stringIn) {

		StringBuilder result = new StringBuilder();

		int carryOver = 0;
		int firstDgit = 0;
		int subsequentDgit1 = 0;
		int subsequentDgit2 = 0;
		int lastDgit = 0;
		int dgitSum = 0;
		int onesPlace = 0;
		int tensPlace = 0;

		firstDgit = Integer.parseInt(stringIn.substring(0, 1));

		lastDgit = Integer.parseInt(stringIn.substring(stringIn.length() - 1));

		if (stringIn.length() == 1) { // 1 digit input

			result.append(stringIn);
			result.append(stringIn);
			return result.toString();
		}

		// iterating through without getting the last index: don't need last
		// index + prevent IndexoutOfBoundsException
		for (int i = 0; i < stringIn.length() - 1; i++) {

			subsequentDgit1 = Integer.parseInt(stringIn.substring(i, i + 1));
			subsequentDgit2 = Integer.parseInt(stringIn.substring(i + 1, i + 2));

			dgitSum = subsequentDgit1 + subsequentDgit2;

			if (i == 0) {
				if (dgitSum > 9) {
					onesPlace = dgitSum % 10; // get last digit
					tensPlace = dgitSum / 10; // get first digit

					firstDgit = tensPlace + firstDgit;
					carryOver = onesPlace;
					result.append(firstDgit);
				} else {
					result.append(firstDgit);
					carryOver = onesPlace;
				}
			}

			if (i > 0) {
				if (dgitSum > 9) {
					onesPlace = dgitSum % 10; // get last digit
					tensPlace = dgitSum / 10; // get first digit

					result.append(tensPlace + carryOver);
					carryOver = onesPlace;
				} else {
					result.append(subsequentDgit1 + carryOver);
					carryOver = onesPlace;
				}
			}

			// execute at 2nd index before last
			if (stringIn.length() - 2 == i) {
				result.append(carryOver);
				result.append(lastDgit);
			}
		}
		return result.toString();
	}
}
