package com.study.practice.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeating {

    public static void main(String[] args) {
        String input = "swiss";
        Character firstNonRepeatingChar = findFirstNonRepeatingCharacter(input);
        System.out.println("First non-repeating character: " + firstNonRepeatingChar);
    }

    public static Character findFirstNonRepeatingCharacter(String input) {

        //To maintain order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // First pass: Count the occurrences of each character
        for (char ch : input.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Second pass: Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; // No non-repeating character found
    }
}
