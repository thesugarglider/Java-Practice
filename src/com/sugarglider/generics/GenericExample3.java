package com.sugarglider.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample3 {

    static <X extends Number> Number sumOfNumber(List<? extends Number> numbers){
         double totalSum = 0.0;
        for(Number number:numbers){
            totalSum += number.intValue();
        }
        return totalSum;
    }

    static void addCoupleOfValues(List<? super Number> numbers){
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1l);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumber(List.of(1,2,3)));
        System.out.println(sumOfNumber(List.of(1.0,2.0,3.0)));
        System.out.println(sumOfNumber(List.of(1l,2l,3l)));

        List empytList = new ArrayList<Number>();
        addCoupleOfValues(empytList);
        System.out.println(empytList);
    }
}
