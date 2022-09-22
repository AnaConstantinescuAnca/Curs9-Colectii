package org.fasttrackit.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(1);
        set.add(0);
        set.add(123);
        set.add(234);

        System.out.println(set);  //nu permite dubluri; nu ordoneaza

        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(1);
        sortedSet.add(2);
        sortedSet.add(1);
        sortedSet.add(0);
        sortedSet.add(123);
        sortedSet.add(234);

        System.out.println(sortedSet); // acum ordoneaza
    }
}
