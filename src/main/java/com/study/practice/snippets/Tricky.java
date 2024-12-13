package com.study.practice.snippets;

import java.util.Iterator;
import java.util.List;

public class Tricky {
    public static void main(String[] args) {
        int a=10;

        List.of("1","2","5","6").forEach(item->{
            if(item == "5")
                a=item;
        });

        System.out.println("Value "+a);
    }

    public void que2(){
        List<?>list = List.of(1,2,3,4,5,6,3);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            Integer value = it.next();

            if (value.equals(3))
                list.remove(value);
        }

        System.out.println(list);
    }
}
