package com.study.practice.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class LongestSubstring {

    public void longestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            log.info("String is empty");
        }

        Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        Set<String> set = new HashSet<>();
        char[] charArr = s.toCharArray();

        for(char ch: charArr){
            if(set.contains(String.valueOf(ch))){
                String temp = set.stream().collect(Collectors.joining());
                map.put(set.size(), temp);
                set = new HashSet<>();
            }
            else{
                set.add(String.valueOf(ch));
            }
        }

        Map.Entry<Integer, String> firstEntry = map.entrySet().iterator().next();

        log.info("Longest substring: " + firstEntry.getKey() + " | Length : " + firstEntry.getValue());
    }

    public static void main(String[] args) {
        LongestSubstring obj = new LongestSubstring();
        String input = "abcabcdbb";

        obj.longestSubstring(input);
    }
}
