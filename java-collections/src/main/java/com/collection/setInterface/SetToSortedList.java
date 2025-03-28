package com.collection.setInterface;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);  // Sorting the list

        System.out.println("Sorted List: " + sortedList);
    }
}
