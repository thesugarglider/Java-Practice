package com.sugarglider.javanewfeatures;

import java.util.List;
import java.util.function.Predicate;

public class Example3 {


    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,5,7,8,9,89,88);
        Predicate<Integer> evenNumberPredicate = number -> number%2==0;

        //print the even numbers
        System.out.print("Even numbers:- ");
        numbers.stream().filter(evenNumberPredicate).forEach(number -> System.out.print(number+" "));

        System.out.println();

        //print the odd numbers
        System.out.print("Odd numbers:- ");
        numbers.stream().filter(evenNumberPredicate.negate()).forEach(number -> System.out.print(number+" "));

        System.out.println();

        //print the even number using method reference
        System.out.print("Even numbers using method preference:- ");
        numbers.stream().filter(Example3Predicate::isEven).forEach(number -> System.out.print(number+" "));

        System.out.println();

        //print the odd number using method reference
        System.out.print("Odd numbers using method preference:- ");
        numbers.stream().filter(Predicate.not(Example3Predicate::isEven)).forEach(number -> System.out.print(number+" "));
    }
}
