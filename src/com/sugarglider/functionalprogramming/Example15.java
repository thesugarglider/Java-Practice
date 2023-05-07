package com.sugarglider.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class Example15 {
    public static void main(String[] args) {
        int sum = IntStream.range(1,11).reduce(0,(n1,n2)-> n1+n2);
        System.out.println(sum);

        /**
         * max() method requires comparator to compare two values.
         */
        int maximum = List.of(12,22,34,54).stream().max((n1,n2)->Integer.compare(n1,n2)).get();
        System.out.println(maximum);
    }
}
