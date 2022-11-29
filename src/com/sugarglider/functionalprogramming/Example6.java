package com.sugarglider.functionalprogramming;

import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        int maxEvenNumber = List.of(23,34,53,38).stream().filter(element -> element%2==0).max((n1, n2) -> Integer.compare(n1,n2)).orElse(0);
        System.out.println(maxEvenNumber);


    }
}
