package com.sugarglider.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A",5);
        hashMap.put("B",13);
        hashMap.put("C",10);
        hashMap.put("D",1);
        System.out.println(hashMap);

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("D",1);
        linkedHashMap.put("B",13);
        linkedHashMap.put("A",5);
        linkedHashMap.put("C",10);
        System.out.println(linkedHashMap);

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("B",13);
        treeMap.put("D",1);
        treeMap.put("C",10);
        treeMap.put("A",5);
        System.out.println(treeMap);
    }
}
