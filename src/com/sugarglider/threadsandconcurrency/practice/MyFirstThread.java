package com.sugarglider.threadsandconcurrency.practice;

import java.util.concurrent.TimeUnit;

public class MyFirstThread {

    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();

        try {
            //Thread.sleep(3000);
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("inside main....");
    }

}
