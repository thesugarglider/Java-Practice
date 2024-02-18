package com.sugarglider.references.dates;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example4 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = localDateTime.format(dateTimeFormatter);
        System.out.println(formattedTime);

        LocalTime localTime = LocalTime.now();
        ///System.out.println(localTime - LocalTime.now() + " seconds");


    }
}
