package com.sugarglider.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample2 {
    public static void main(String[] args) {
        Set<Integer> hashedSet = new HashSet<>();
        hashedSet.add(765432);
        hashedSet.add(76543);
        hashedSet.add(7654);
        hashedSet.add(765);
        hashedSet.add(76);
        System.out.println(hashedSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(765432);
        linkedHashSet.add(76543);
        linkedHashSet.add(7654);
        linkedHashSet.add(765);
        linkedHashSet.add(76);
        System.out.println(linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(765432);
        treeSet.add(76543);
        treeSet.add(7654);
        treeSet.add(765);
        treeSet.add(76);
        System.out.println(treeSet);
    }
}
