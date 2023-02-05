/**
 * explore some inbuild enums such as DayofTheWeek, Month etc.
 */

package com.sugarglider.javatips;


import java.util.Arrays;

public class Example12Runner {
    public static void main(String[] args) {
        Example12 example12 = Example12.WINTER;
        System.out.println(example12);

        System.out.println(Example12.SPRING.ordinal());
        System.out.println(Example12.SPRING.getValue());

        System.out.println(Arrays.toString(Example12.values()));

        System.out.println(Example12.SPRING.name());

    }
}
