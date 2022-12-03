package com.sugarglider.threadsandconcurrency;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {
        Example1 task1 = new Example1();
        task1.setPriority(10);
        task1.run();

        Example2 task2 = new Example2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();

        task1.join();
        task2Thread.join();

        System.out.println("Task 3 Started");
        for (int k=301;k<=305;k++) {
            System.out.println(k+" ");
        }
        System.out.println("Task 3 Done");
    }
}
