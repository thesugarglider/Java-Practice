package com.sugarglider.threadsandconcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example6 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Example1());
        executorService.execute(new Thread(new Example2()));


        System.out.println("Task 3 Started");
        for (int k=301;k<=305;k++) {
            System.out.println(k+" ");
        }
        System.out.println("Task 3 Done");

        executorService.shutdown();
    }
}
