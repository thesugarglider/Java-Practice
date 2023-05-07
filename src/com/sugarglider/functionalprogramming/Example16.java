package com.sugarglider.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example16 {
    public static void main(String[] args) {
        /**
         * to get the output as a list
         */
        List<Integer> oddNumbers = List.of(12,23,32,43).stream().filter(element -> element%2!=0).collect(Collectors.toList());
        System.out.println(oddNumbers);

        List<Integer> squares = IntStream.range(1,11).map(element -> element*element).boxed().collect(Collectors.toList());
        System.out.println(squares);
    }
}
