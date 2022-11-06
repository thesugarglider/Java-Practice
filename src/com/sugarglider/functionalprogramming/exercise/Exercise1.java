package com.sugarglider.functionalprogramming.exercise;

import java.util.List;
import java.util.stream.IntStream;

public class Exercise1 {
    public static void main(String[] args) {

        //my method
        IntStream numbers = IntStream.range(1,11);
        numbers.forEach(number -> System.out.print((number*number)+" "));

        System.out.println();

        //tutorial method
        IntStream numbers2 = IntStream.range(1,11);
        numbers2.map(e -> e * e).forEach(e -> System.out.print(e+" "));

    }
}
