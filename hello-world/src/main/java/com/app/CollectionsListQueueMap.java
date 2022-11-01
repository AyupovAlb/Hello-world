package com.app;

import java.util.*;

public class CollectionsListQueueMap {
    public static void main(String[] args) {
        List<Integer> guitarStrings = new ArrayList<>();
        guitarStrings.add(9);
        guitarStrings.add(11);
        guitarStrings.add(17);
        guitarStrings.add(24);
        guitarStrings.add(32);
        guitarStrings.add(42);
        System.out.println(guitarStrings);

        Map<String, Integer> guitarStrings1 = new LinkedHashMap<>();
        guitarStrings1.put("ми", 9);
        guitarStrings1.put("си", 11);
        guitarStrings1.put("соль", 17);
        guitarStrings1.put("ре", 24);
        guitarStrings1.put("ля", 32);
        guitarStrings1.put("Ми", 42);
        System.out.println(guitarStrings1);

        Queue<Integer> guitarStrings2 = new LinkedList<>();
        guitarStrings2.add(9);
        guitarStrings2.add(11);
        guitarStrings2.add(17);
        guitarStrings2.add(24);
        guitarStrings2.add(32);
        guitarStrings2.add(42);
        while (!guitarStrings2.isEmpty()) {
            System.out.println(guitarStrings2.poll());
        }
    }
}
