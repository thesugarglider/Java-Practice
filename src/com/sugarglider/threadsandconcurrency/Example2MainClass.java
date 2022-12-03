package com.sugarglider.threadsandconcurrency;

public class Example2MainClass {
    public static void main(String[] args) {


        System.out.println("Task 1 Started");
        for (int j=101;j<=105;j++) {
            System.out.println(j+" ");
        }
        System.out.println("Task 1 Done");

        Example2 task2 = new Example2();
        Thread task2Thread = new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();

        System.out.println("Task 3 Started");
        for (int k=301;k<=305;k++) {
            System.out.println(k+" ");
        }
        System.out.println("Task 3 Done");

    }
}
