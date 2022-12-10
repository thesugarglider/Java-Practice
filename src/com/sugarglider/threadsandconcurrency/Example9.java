package com.sugarglider.threadsandconcurrency;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example9 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        List<Example8> tasks = List.of(new Example8("ranga"), new Example8("bacchi"), new Example8("pravin"));

        List<Future<String>> results = executorService.invokeAll(tasks);

        for(Future<String> result:results){
            System.out.println(result.get());
        }

        executorService.shutdown();
    }
}
