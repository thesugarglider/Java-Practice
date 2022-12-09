package com.sugarglider.threadsandconcurrency;

public class Example2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Task 2 Started");
        for (int i=201;i<=205;i++){
            System.out.println(i+" ");
        }
        System.out.println("Task 2 Done");
    }
}
