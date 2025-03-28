package com.collection.setInterface;

import java.util.HashSet;

public class SetSymmetricDifference {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        HashSet<Integer> symmetricDifference = new HashSet<>(set1);
        symmetricDifference.addAll(set2);  // Union of both sets
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);  // Intersection of both sets
        symmetricDifference.removeAll(intersection);  // Removing common elements

        System.out.println("Symmetric Difference: " + symmetricDifference);
    }
}

