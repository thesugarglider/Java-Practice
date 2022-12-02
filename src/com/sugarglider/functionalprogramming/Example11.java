package com.sugarglider.functionalprogramming;

import java.util.List;

public class Example11 {
    public static void main(String[] args) {
        int maxEven = List.of(2,3,11,34).stream().filter(element -> element%2==0).max((n1,n2) -> Integer.compare(n1,n2)).orElse(0);
        System.out.println(maxEven);

        int maxEven2 = List.of(2,3,11,34).stream().filter(Example11::isEven).max(Integer::compare).orElse(0);
        System.out.println(maxEven2);
    }

    public static boolean isEven(Integer number){
        return number%2==0;
    }
}
