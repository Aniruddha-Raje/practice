package com.study.practice.leetcode;

import java.util.*;
import java.util.stream.Collectors;

record Employee (Integer salary, String name, String dept) {
}

public class HighestByDept {
    public static void main(String[] args) {

        List<Employee> employees = List.of(new Employee(1000, "aaa", "sales"),
                new Employee(2000, "bbb", "delivery"),
                new Employee(3000, "ccc", "sales"),
                new Employee(4000, "ddd", "delivery")
        );

        Map<String, List<Employee>> grouppedEmployees = employees.stream().collect(Collectors.groupingBy(Employee::dept));
        Map<String, Integer> mapDeptMaxSal = new HashMap<>();

        grouppedEmployees.forEach((dept,empList) -> {

            Optional<Employee> emp = empList.stream().sorted(Comparator.comparingInt(Employee::salary).reversed()).findFirst();

            mapDeptMaxSal.put(dept, emp.get().salary());

        });

        System.out.println(mapDeptMaxSal);

    }
}
