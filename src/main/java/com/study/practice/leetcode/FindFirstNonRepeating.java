package com.study.practice.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class FindFirstNonRepeating {

    public static void main(String[] args) {
        String input = "swiss";

        char[] charArr = input.toCharArray();
        Set<Character> set = new HashSet<>();

        for(char ch: charArr){
            if(set.contains(ch)){
                log.info(String.valueOf(set.stream().skip(1).findFirst()));
                break;
            }
            else {
                set.add(ch);
            }
        }
    }
}
