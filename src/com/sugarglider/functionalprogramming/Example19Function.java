package com.sugarglider.functionalprogramming;

import java.util.function.Function;

public class Example19Function implements Function<Integer,Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer*integer;
    }
}
