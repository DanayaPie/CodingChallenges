package codingChallenges.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SquarePatch {

    /*-
     * Problem: Square Patch (n x n Square Array)
     *
     * Create a function that takes an integer and outputs an n x n square
     * solely consisting of the integer n.
     *
     * Examples:
     * - squarePatch(3) --> [
     * [3, 3, 3],
     * [3, 3, 3],
     * [3, 3, 3]
     * ]
     *
     * - squarePatch(5) --> [
     * [5, 5, 5, 5, 5],
     * [5, 5, 5, 5, 5],
     * [5, 5, 5, 5, 5],
     * [5, 5, 5, 5, 5],
     * [5, 5, 5, 5, 5]
     * ]
     * squarePatch(1) --> [
     * [1]
     * ]
     *
     * Note: If n = 0, return an empty array.
     * -squarePatch(0) --> []
     * n >= 0.
     */

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to create square patch");

        int input = scanner.nextInt();
        scanner.close();

        squarePatch(input);
    }

    private static void squarePatch(int input) {

        for (int row = 0; row < input; row++) {

            if (row != 0) {
                System.out.println(row <= input - 1 ? "," : "");

            }
            System.out.print("[");

            for (int col = 0; col < input; col++) {
                System.out.print(input + (col == input - 1 ? "]" : ", "));

            }
        }
    }
}
