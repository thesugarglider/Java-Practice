package com.sugarglider.threadsandconcurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example8MainClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welcomeFuture = executorService.submit(new Example8("ranga"));

        System.out.println("Example8 executed");
        System.out.println(welcomeFuture.get());

        System.out.println("main completed");

        executorService.shutdown();
    }
}
