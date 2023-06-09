package codingChallenges.Java;

import java.util.*;

public class RemoveDupNum {

    // Write a Java program to remove duplicates from an array of integers
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 6, 1};

        System.out.println(removeDup(arr));
    }

//    // hasSet -> O(n) TC and SC
//    private static Set<Integer> removeDup(int[] arr) {
//
//        Set<Integer> noDupSet = new HashSet();
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (!noDupSet.contains(arr[i])) {
//                noDupSet.add(arr[i]);
//            }
//        }
//
//        return noDupSet;
//    }

    // hashMap -> O(n) TC
    private static HashMap<Integer, Integer> removeDup(int[] arr) {

        HashMap<Integer, Integer>  noDupMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (!noDupMap.containsKey(arr[i])) {
                noDupMap.put(arr[i], i);
            }
        }

        return noDupMap;
    }
}
