package com.study.practice.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class Test {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,3,5,2,7,6,10,8,9,4);
        List<String> strings = List.of("Hello", "World", "Learn", "Java");
        String str = "Aniruddha Raje";

        List<City> list = Arrays.asList(
                new City("aa", 100),
                new City("bb", 200),
                new City("cc", 300),
                new City("cc", 400),
                new City("aa", 250),
                new City("dd", 350),
                new City("ee", 150)
        );

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        log.info(numbers.toString() + strings + str + listOfLists +  list);

        numbers.stream().reduce(0, Integer::sum);
        numbers.stream().mapToInt(Integer::intValue).average();
        numbers.stream().max(Integer::compareTo);
        numbers.stream().skip(numbers.size()-2).findFirst();
        numbers.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).findFirst();
        numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        numbers.stream().anyMatch(n -> n ==10);

        list.stream().sorted(Comparator.comparingInt(City::population).reversed()).skip(2).findFirst();

        strings.stream().collect(Collectors.joining(" | "));
        strings.stream().map(String::toUpperCase);

        listOfLists.stream().flatMap(Collection::stream).toList();


        char[] chars = str.toCharArray();
        Map<String, Integer> map = new HashMap<>();

        for(char ch: chars){
            if(map.containsKey(String.valueOf(ch))){
                map.put(String.valueOf(ch), map.get(String.valueOf(ch) + 1));
            }
            else{

            }
        }

        String[] atrrs = str.split(" ");
        Collections.reverse(Arrays.stream(atrrs).toList());
    }
}