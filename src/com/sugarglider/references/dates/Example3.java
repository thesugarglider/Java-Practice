package com.sugarglider.references.dates;

import java.time.LocalDate;

public class Example3 {
    public static void main(String[] args) {
        LocalDate yesterday = LocalDate.of(2022, 9, 14);
        System.out.println(yesterday);

        LocalDate today = LocalDate.now();
        System.out.println(today.withYear(2021));

        System.out.println(today);
        System.out.println(today.isBefore(yesterday));
        System.out.println(today.isAfter(yesterday));

    }
}
