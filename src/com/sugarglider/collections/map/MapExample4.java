package com.sugarglider.collections.map;

import java.util.TreeMap;

public class MapExample4 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A",20);
        treeMap.put("D",5);
        treeMap.put("F",15);
        treeMap.put("B",16);
        treeMap.put("C",3);

        System.out.println(treeMap);

        //higher than
        System.out.println(treeMap.higherKey("B"));

        //greater than or equalto
        System.out.println(treeMap.ceilingKey("B"));

        //lower than
        System.out.println(treeMap.lowerKey("B"));

        //lower than or equal to
        System.out.println(treeMap.floorKey("B"));

        System.out.println(treeMap.firstEntry());

        System.out.println(treeMap.lastEntry());

        System.out.println(treeMap.subMap("B","D"));

        System.out.println(treeMap.subMap("B",true,"D",true));
    }
}
