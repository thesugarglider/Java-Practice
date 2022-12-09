package com.sugarglider.threadsandconcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example7MainClass {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new Example7(1));
        executorService.execute(new Example7(2));
        executorService.execute(new Example7(3));
        //executorService.execute(new Example7(4));

        executorService.shutdown();

    }
}
