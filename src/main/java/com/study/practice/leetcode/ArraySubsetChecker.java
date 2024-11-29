package com.study.practice.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Slf4j
public class ArraySubsetChecker {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4, 5};

        String str1 = Arrays.toString(array1);
        String str2 = Arrays.toString(array2);
        log.info("Is substring " + str2.contains(str1));

        boolean isSubset = isArraySubset(array1, array2);
        log.info("Is array1 a subset of array2? " + isSubset);
    }

    public static boolean isArraySubset(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr2) {
            set.add(num);
        }

        for (int num : arr1) {
            if (!set.contains(num)) {
                //If any element from arr1 is not found in the set, return false.
                return false;
            }
        }

        //If all elements are found, return true
        return true;
    }
}
