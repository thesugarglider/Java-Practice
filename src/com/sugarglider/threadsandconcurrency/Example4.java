package com.sugarglider.threadsandconcurrency;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("thread awake now");

        Thread.yield();
        System.out.println("can use now");
    }
}
