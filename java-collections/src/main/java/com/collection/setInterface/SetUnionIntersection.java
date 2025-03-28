package com.collection.setInterface;

import java.util.HashSet;

public class SetUnionIntersection {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);  // Union of set1 and set2

        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);  // Intersection of set1 and set2

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}

