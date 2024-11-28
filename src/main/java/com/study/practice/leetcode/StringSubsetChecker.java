package com.study.practice.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringSubsetChecker {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aabbcc";

        boolean isSubset = isSubset(str1, str2);
        log.info("Is \"" + str1 + "\" a subset of \"" + str2 + "\"? " + isSubset);
    }

    public static boolean isSubset(String str1, String str2) {
        int index1 = 0, index2 = 0;

        while (index1 < str1.length() && index2 < str2.length()) {
            if (str1.charAt(index1) == str2.charAt(index2)) {
                index1++;
            }
            index2++;
        }

        return index1 == str1.length();
    }
}
