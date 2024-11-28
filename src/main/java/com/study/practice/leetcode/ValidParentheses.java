package com.study.practice.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class ValidParentheses {
    public static void main(String[] args) {
        String input = "({[]})";

        boolean isValid = isValidParentheses(input);

        log.info("Is the input valid? " + isValid);
    }

    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
