package com.sugarglider.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A",4,"B",5,"C",6);

        //map.put("D",8);

        System.out.println(map);
        System.out.println(map.get("A"));
        System.out.println(map.size());
        System.out.println(map.containsKey("D"));
        System.out.println(map.containsValue(6));
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.values());

        Map<String, Integer> hashMap = new HashMap<>(map);
        hashMap.put("D",8);
        System.out.println(hashMap);

    }
}
