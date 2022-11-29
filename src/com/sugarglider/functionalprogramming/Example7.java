package com.sugarglider.functionalprogramming;

import java.util.function.Predicate;

public class Example7 implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer%2==0;
    }
}
