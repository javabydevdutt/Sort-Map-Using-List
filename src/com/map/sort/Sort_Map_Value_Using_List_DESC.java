package com.map.sort;

import java.util.*;

public class Sort_Map_Value_Using_List_DESC {
    private static Map<String, Integer> sortMapKeyListDesc(Map<String, Integer> unsortMap) {
        // 1. Convert Map to List of Map
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }//method

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("key : [ " + entry.getKey() + " ] Value : [ " + entry.getValue() + " ]");
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> unSortMap = new HashMap<>();
        unSortMap.put("fish", 60);
        unSortMap.put("hen", 80);
        unSortMap.put("ice", 90);
        unSortMap.put("egg", 50);
        unSortMap.put("girl", 70);
        unSortMap.put("dog", 40);
        unSortMap.put("ball", 20);
        unSortMap.put("cat", 30);
        unSortMap.put("apple", 10);

        System.out.println("\nSorted Map......By Value");
        Map<String, Integer> sortedMap = sortMapKeyListDesc(unSortMap);
        printMap(sortedMap);
    }//main
}
