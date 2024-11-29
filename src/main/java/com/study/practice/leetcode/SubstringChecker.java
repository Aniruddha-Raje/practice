package com.study.practice.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubstringChecker {
    public static void main(String[] args) {

        char[] charArray1 = {'H', 'e', 'l', 'l', 'o'};
        char[] charArray2 = {'l', 'l', 'o'};

        String str1 = new String(charArray1);
        String str2 = new String(charArray2);

        boolean isSubstring = str1.contains(str2);
        log.info(str2 + " is a substring of " + str1 + " : " + isSubstring);
    }
}