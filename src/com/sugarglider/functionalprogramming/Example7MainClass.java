package com.sugarglider.functionalprogramming;

import java.util.List;

public class Example7MainClass {
    public static void main(String[] args) {
        int evenNumber = List.of(23,34,43,38).stream().filter(new Example7()).max((n1,n2) -> Integer.compare(n1,n2)).get();
        System.out.println(evenNumber);

        int newEvenNumber = List.of(23,34,43,38).stream().filter(element -> element%2==0).max((n1,n2) -> Integer.compare(n1,n2)).orElse(0);
        System.out.println(newEvenNumber);
    }
}
