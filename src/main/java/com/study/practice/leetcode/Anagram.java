package com.study.practice.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class Anagram {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "olleh";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        log.info("are Strings anagram: " +  Arrays.equals(arr1, arr2));
    }
}
