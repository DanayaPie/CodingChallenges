package codingChallenges;

import java.util.Scanner;

public class MemorySize {

	/*-
	 * Problem: MemorySize
	 * 
	 * Create a function that takes the memory size (ms is a string type) as an argument 
	 * and returns the actual memory size.
	 * 
	 * Examples:
	 * - actualMemorySize("32GB") --> "29.76GB"
	 * - actualMemorySize("2GB") --> "1.86GB"
	 * - actualMemorySize("512MB") --> "476MB"
	 * 
	 * Notes:
	 * -The actual storage loss on a USB device is 7% of the overall memory size!
	 * -If the actual memory size was greater than 1 GB, round your result to two decimal places.
	 * -If the memory size after adjustment is smaller then 1 GB, return the result in MB.
	 */

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type memory size containing 'GB' or 'MB' unit");
		String input = scanner.next();

		if (!input.toUpperCase().contains("GB") || !input.toUpperCase().contains("MB")) {
			System.out.println("MUST identify the unit in 'GB' or 'MB'");
			input = scanner.next();
		}

		scanner.close();

//		String input = "32GB";
//		String input = "2GB";
//		String input = "512MB";

		System.out.println("Actual memory size of " + input.toUpperCase() + " is " + actualMemorySize(input));
	}

	private static String actualMemorySize(String input) {
		String type = input.substring(input.length() - 2).toUpperCase();
		double memorySize = Double.parseDouble(input.substring(0, input.length() - 2));

		double actualSize = memorySize * 0.93;

		if (type.equals("GB") && actualSize < 1) {

			type = "MB";
			actualSize = actualSize * 1000;
		}

		if (type.equals("MB") && actualSize > 1000) {

			type = "GB";
			actualSize = actualSize / 1000;
		}

		return actualSize + type;
	}
}
