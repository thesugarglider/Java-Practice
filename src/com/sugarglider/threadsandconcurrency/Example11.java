package com.sugarglider.threadsandconcurrency;

public class Example11 {

    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getClass().getName());

        System.out.println(currentThread);
        getThreadState(currentThread);

        currentThread.setName("MainGuy");
        currentThread.setPriority(Thread.MAX_PRIORITY);
        getThreadState(currentThread);
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
