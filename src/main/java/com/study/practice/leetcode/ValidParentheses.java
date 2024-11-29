package com.study.practice.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class ValidParentheses {
    public static void main(String[] args) {

        boolean isValid = true;
        Stack<Character> stack = new Stack<>();

        String input = "({[{}]})";

        for (char c : input.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                //push opening parenthesis into the stack.
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                isValid = false;
            }
        }

        log.info("Input has valid parentheses " + (stack.isEmpty() && isValid));
    }
}
