package com.study.practice.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubsetChecker {
    public static void main(String[] args) {
        isStringSubset();
        isNumberSubset();
    }

    public static void isStringSubset() {

        String str1 = "abc";
        String str2 = "aabbcc";

        int index1 = 0, index2 = 0;

        while (index1 < str1.length() && index2 < str2.length()) {

            //If characters at the current indices match, increment index1.
            if (str1.charAt(index1) == str2.charAt(index2)) {
                index1++;
            }
            index2++;
        }

        boolean isStringSubset = index1 == str1.length();

        log.info("isStringSubset: " + isStringSubset);
    }

    public static void isNumberSubset() {

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4, 5};

        int index1 = 0, index2 = 0;

        while (index1 < array1.length && index2 < array2.length) {

            //If characters at the current indices match, increment index1.
            if (array1[index1] == array2[index2]) {
                index1++;
            }

            index2++;
        }

        boolean isSubset = index1 == array1.length;

        log.info("Is int Array a subset " + isSubset);
    }
}
