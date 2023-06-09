package codingChallenges.Java;

public class FindMissingNumInSortedArr {

    // Find the Missing Number: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array
    public static void main(String[] args) {

        int[] arr = {0, 1, 3, 4, 5};

        System.out.println(missingNum(arr));
    }

    private static int missingNum(int[] arr) {

        int numCounter = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != numCounter) {
                return numCounter;
            } else {
                numCounter++;
            }
        }

        return numCounter;
    }
}
