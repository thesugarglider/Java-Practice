package com.sugarglider.threadsandconcurrency.practice;

public class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("inside run...");
        go();
    }

    private void go() {
        System.out.println("inside go...");
        more();
    }

    private void more() {
        System.out.println("inside more...");
    }

}
