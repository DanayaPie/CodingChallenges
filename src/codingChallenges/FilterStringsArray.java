package codingChallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterStringsArray {

    /*-
     * Problem: Filter Out Strings from an Array
     *
     * Create a function that takes an array of non-negative integers and
     * strings and returns a new array without the strings.
     *
     * Examples: filterArray([1, 2, "a", "b"]) -> [1, 2]
     * filterArray([1, "a", "b", 0, 15]) -> [1, 0, 15]
     * filterArray([1, 2, "aasf", "1", "123", 123]) -> [1, 2, 123]
     *
     * Notes: Zero is a non-negative integer. The given array only has integers
     * and strings. Numbers in the array should not repeat. The original order
     * must be maintained.
     */

    public static void main(String args[]) {
        Object[] objIn = new Object[]{"Pie", "96", 11, -96, 0};

        Integer[] intArray = filterStringsArray(objIn);
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + ((i == intArray.length - 1) ? "" : ", "));
        }

    }

    private static Integer[] filterStringsArray(Object[] objIn) {
        List<Integer> intArray = new ArrayList();

        for (int i = 0; i < objIn.length; i++) {

            if (objIn[i] instanceof java.lang.Integer) {

                if ((Integer) objIn[i] < 0) {
                    System.out.println(objIn[i] + " is a negative integer.");

                    continue; // skip to the next loop
                }

                System.out.println(objIn[i] + " is in int format.");

                intArray.add((Integer) objIn[i]);

            } else {
                System.out.println(objIn[i] + " is not in int format.");
            }

            /*-
             *  Parsing the object to int does not work because it parse string of number to int
             *  - not following guideline
             */
//			try {
//				System.out.println(objIn[i]);
//				Integer num = Integer.parseInt(objIn[i].toString()); // turn object into String format
//
//				System.out.println(objIn[i] + " is a number.");
//				
//				intArray.add(num);
//
//			} catch (NumberFormatException e) {
//				System.out.println(objIn[i] + " not parsing");
//			}
        }

        return intArray.toArray(new Integer[0]);

    }
}
