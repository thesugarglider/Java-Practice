/**
 * to make unmodifiable list from existing list use copyOf method
 */

package com.sugarglider.javanewfeatures;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Rahul");
        names.add("Ranga");
        names.add("Ravi");

        List<String> copyOfNames = List.copyOf(names);

        doNotChange(copyOfNames);
        System.out.println(copyOfNames);
    }

    private static void doNotChange(List<String> names) {
        names.add("ShouldNotBeChanged");
    }
}
