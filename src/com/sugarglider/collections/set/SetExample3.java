package com.sugarglider.collections.set;


import java.util.*;

public class SetExample3 {
    public static void main(String[] args) {
        List<Character> characters = List.of('A','Z','A','B','Z','F');

        //does not maintain any order
        Set<Character> hashSet = new HashSet<>(characters);
        System.out.println("hashSet-> "+hashSet);

        //maintain insertion order
        Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
        System.out.println("linkedHashSet-> "+linkedHashSet);

        //maintain sorted order
        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println("treeSet-> "+treeSet);
    }
}
