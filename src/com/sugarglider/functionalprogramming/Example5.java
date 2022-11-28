package com.sugarglider.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example5 {
    public static void main(String[] args) {
        int maxNumber = List.of(23,34,53,38).stream().max((n1,n2) -> Integer.compare(n1,n2)).get();
        System.out.println(maxNumber);

        int minNumber = List.of(23,34,53,38).stream().min((n1,n2) -> Integer.compare(n1,n2)).get();
        System.out.println(minNumber);

        List<Integer> oddNumbers = List.of(23,34,53,38).stream().filter(e -> e%2==1).collect(Collectors.toList());
        System.out.println(oddNumbers);

        List<Integer> evenNumbers = List.of(23,34,53,38).stream().filter(e -> e%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        List<Integer> sqauresOfNumber = (List<Integer>) IntStream.range(1,11).map(e -> e * e).boxed().collect(Collectors.toList());
        System.out.println(sqauresOfNumber);
    }
}
