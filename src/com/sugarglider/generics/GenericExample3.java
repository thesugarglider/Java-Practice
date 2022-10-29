package com.sugarglider.generics;

import java.util.List;

public class GenericExample3 {

    static Number sumOfNumber(List<? extends Number> numbers){
        Number totalSum = 0.0;
        for(Number number:numbers){
            totalSum += number;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumber(List.of(1,2,3)));
        System.out.println(sumOfNumber(List.of(1.0,2.0,3.0)));
        System.out.println(sumOfNumber(List.of(1l,2l,3l)));
    }
}
