package com.collection.setInterface;

import java.util.HashSet;

public class SetSubset {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        boolean isSubset = set2.containsAll(set1);  // Check if set1 is a subset of set2
        System.out.println("Is set1 a subset of set2? " + isSubset);
    }
}

