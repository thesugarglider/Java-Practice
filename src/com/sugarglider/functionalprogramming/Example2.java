package com.sugarglider.functionalprogramming;

import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,4,7,9);
        evenNumbers(numbers);
        oddNumbers(numbers);

    }

    public static void evenNumbers(List<Integer> numbers){
        numbers.stream().filter(element -> element%2==0).forEach(element -> System.out.println(element));
    }

    public static void oddNumbers(List<Integer> numbers){
        numbers.stream().filter(element -> element%2!=0).forEach(element -> System.out.println(element));
    }
}
