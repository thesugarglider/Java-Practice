package com.sugarglider.threadsandconcurrency;

import java.util.concurrent.Callable;

public class Example8 implements Callable<String> {

    private  String name;

    Example8(String name){
        this.name = name;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello "+this.name;
    }
}
