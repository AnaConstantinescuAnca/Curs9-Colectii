package org.fasttrackit.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

        List<Integer> linkedIntegers = new LinkedList<>();

        integers.add(1);
        integers.add(2);
        integers.add(1);

        integers.get(1);

        System.out.println(integers);  // se observa ordinea stabilita si permite si duplicate

        System.out.println(integers.size());  // metoda ce obtine lungimea unei liste
    }

    public static void doSomething(List<String> list) {

    }
}
