package com.sugarglider.functionalprogramming;

import java.util.function.Consumer;

public class Example18Consumer implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
