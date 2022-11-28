package com.sugarglider.functionalprogramming.exercise;

import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {

        //my method
        List.of("Apple","Ant","Axis").stream().forEach(element -> System.out.print(element.toLowerCase()+" "));

        System.out.println();

        //tutorial method
        List.of("Apple","Ant","Axis").stream().map(e -> e.toLowerCase()).forEach(e -> System.out.print(e+" "));
    }
}
