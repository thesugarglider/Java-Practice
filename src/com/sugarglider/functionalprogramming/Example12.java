package com.sugarglider.functionalprogramming;

import java.util.List;

public class Example12 {
    public static void main(String[] args) {

        int sum = List.of(1,2,3,4).stream().reduce((num1, num2)-> num1+num2).get();
        System.out.println(sum);

        int sum1 = List.of(1,2,3,4).stream().reduce(0,(num1, num2)->num1+num2);
        System.out.println(sum1);
    }
}
