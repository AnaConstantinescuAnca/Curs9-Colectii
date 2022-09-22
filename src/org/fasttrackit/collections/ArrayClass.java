package org.fasttrackit.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayClass {
    public static void main(String[] args) {
        int[] numb = {1,2,3};
        System.out.println(numb[0]);
        int[] numbers = new int[5];
        System.out.println(numbers.length);

        List<Integer> list = new ArrayList<>();

        list.add(new Integer(1));
        System.out.println(list.get(0));
        list.add(20);
        list.add(39);
        System.out.println(list.get(2)); //39
        System.out.println(list.contains(2)); //false

    }

}
