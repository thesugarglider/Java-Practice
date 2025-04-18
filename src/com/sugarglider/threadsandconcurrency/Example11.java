package com.sugarglider.threadsandconcurrency;

import java.util.concurrent.TimeUnit;

public class Example11 {

    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getClass().getName());

        System.out.println(currentThread);
        getThreadState(currentThread);

        currentThread.setName("MainGuy");
        currentThread.setPriority(Thread.MAX_PRIORITY);
        getThreadState(currentThread);

        Example12 example12 = new Example12();
        example12.start();

        Runnable myRunnable = () -> {
            for (int i = 1; i<= 8 ; i++){
                System.out.print(" 2 ");
                try {
                    TimeUnit.MILLISECONDS.sleep(250);
                } catch (InterruptedException exception){
                    exception.printStackTrace();
                }
            }
        };

        Thread myThread = new Thread(myRunnable);
        myThread.start();

        for(int i = 1; i <=3 ; i++){
            System.out.print(" 0 ");
        } try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }

    public static void getThreadState(Thread thread){
        System.out.println("------------------------------------");
        System.out.println("Thread ID " + thread.threadId());
        System.out.println("Thread Priority " + thread.getPriority());
        System.out.println("Thread State " + thread.getState());
        System.out.println("Thread Name " + thread.getName());
        System.out.println("Thread Group " + thread.getThreadGroup());
        System.out.println("Thread Alive " + thread.isAlive());
        System.out.println("------------------------------------");
    }

}
