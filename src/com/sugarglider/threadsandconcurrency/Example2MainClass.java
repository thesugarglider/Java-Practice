package com.sugarglider.threadsandconcurrency;

public class Example2MainClass {
    public static void main(String[] args) {

        Example2 task1 = new Example2();
        Thread task1Thread = new Thread(task1);

        task1Thread.start();

        System.out.println("Task 2 Started");
        for (int j=201;j<=205;j++) {
            System.out.println(j+" ");
        }
        System.out.println("Task 2 Done");


        System.out.println("Task 3 Started");
        for (int k=301;k<=305;k++) {
            System.out.println(k+" ");
        }
        System.out.println("Task 3 Done");

    }
}
