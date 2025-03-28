package com.collection.setInterface;

import java.util.HashSet;

public class SetComparison {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(2);
        set2.add(1);

        boolean areEqual = set1.equals(set2);
        System.out.println("Are the two sets equal? " + areEqual);
    }
}

