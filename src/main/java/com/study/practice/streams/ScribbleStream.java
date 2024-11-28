package com.study.practice.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class ScribbleStream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,5,2,7,6);

        List<Integer> sortedList =  list.stream()
                .filter(e -> e > 2)
                .map(e -> e*2)
                .sorted(Comparator.reverseOrder())
                .toList();
        log.info("sortedList => " + sortedList);
    }
}
