package com.sugarglider.references.dates;

import java.time.LocalDate;

public class Example2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.getYear());
        System.out.println(today.getMonth());

        System.out.println(today.getDayOfYear());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());

        System.out.println(today.isLeapYear());
        System.out.println(today.lengthOfYear());
        System.out.println(today.lengthOfMonth());

        System.out.println(today.getMonthValue());


    }
}
