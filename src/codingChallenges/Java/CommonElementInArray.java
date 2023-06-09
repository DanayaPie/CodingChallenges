package codingChallenges.Java;

import java.util.HashSet;
import java.util.Set;

public class CommonElementInArray {

    // Write a Java program to find the common elements between two arrays
    public static void main(String[] args) {

        int[] arr1 = {5, 3, 9, 2};
        int[] arr2 = {6, 3, 5, 1};

        Set<Integer> arr1Set = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {

            if (!arr1Set.contains(arr1[i])) {
                arr1Set.add(arr1[i]);
            }
        }

        for (int i = 0; i < arr2.length; i++) {

            if (arr1Set.contains(arr2[i])) {
                commonSet.add(arr2[i]);
            }
        }

        System.out.println("commonSet: " + commonSet);
    }
}
