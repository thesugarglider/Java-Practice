//ArrayList

package com.sugarglider.arrays;

import java.util.ArrayList;
import java.util.Comparator;

public class Example7 {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();
        marks.add(99);
        marks.add(100);
        marks.add(97);
        System.out.println(marks);

        marks.sort(Comparator.naturalOrder());
        System.out.println(marks);

        marks.remove(0);
        System.out.println(marks);

        marks.add("five");
        System.out.println(marks);
    }
}
