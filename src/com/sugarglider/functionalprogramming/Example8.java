package com.sugarglider.functionalprogramming;

import java.util.function.Consumer;

public class Example8 implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.print(integer+" ");
    }
}
