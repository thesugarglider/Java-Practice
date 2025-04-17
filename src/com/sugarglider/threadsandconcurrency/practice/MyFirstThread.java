package com.sugarglider.threadsandconcurrency.practice;

public class MyFirstThread {

    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("inside main....");
    }

}
