package com.sugarglider.functionalprogramming.exercise;

import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {

        //my method
        List.of("Apple","Ant","Bat").stream().forEach(element -> System.out.print(element.length()+" "));

        System.out.println();

        //tutorial method
        List.of("Apple","Ant","Bat").stream().map(e -> e.length()).forEach(e -> System.out.print(e+" "));

    }
}
