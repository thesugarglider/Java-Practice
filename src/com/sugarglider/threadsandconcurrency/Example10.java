package com.sugarglider.threadsandconcurrency;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example10 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<Example8> tasks = List.of(new Example8("ranga"), new Example8("bacchi"), new Example8("pravin"));

        String result = executorService.invokeAny(tasks);

        System.out.println(result);

        executorService.shutdown();
    }
}
