package com.study.practice.snippets;

import java.util.ArrayList;
import java.util.List;

public class Java8NewMethods {
    public static void main(String[] args) {

        //Joins elements of a sequence with a delimiter
        String result = String.join(", ", "Java", "Python", "C++");
        System.out.println(result); // Output: Java, Python, C++

        //Repeats the string a specified number of times
        String repeated = "Hello ".repeat(3);// Output: Hello Hello Hello

        //strip, stripLeading, stripTrailing:
        String stripped = "  Hello  ".strip();// Output: Hello

        boolean blank = "  ".isBlank(); // Output: true



        //Creates an unmodifiable list
        List<String> list = List.of("Java", "Python", "C++"); // Output: [Java, Python, C++]

        //Creates an unmodifiable copy
        List<String> original = new ArrayList<>(List.of("Java", "Python"));
        List<String> copy = List.copyOf(original); // Output: [Java, Python]

        //Checks if the list is empty
        List<String> emptyList = List.of();
        boolean empty = emptyList.isEmpty(); // Output: true


    }
}
