package com.sugarglider.threadsandconcurrency;

public class Example1 extends Thread {

    public void run(){
        System.out.println("Task 1 Started");
        for (int i=101;i<=105;i++){
            System.out.println(i+" ");
        }
        System.out.println("Task 1 Done");
    }

}
