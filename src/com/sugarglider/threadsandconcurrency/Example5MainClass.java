package com.sugarglider.threadsandconcurrency;

public class Example5MainClass {
    public static void main(String[] args) {
        Example5 thread1 = new Example5();
        Example5 thread2 = new Example5();

        System.out.println(thread1.add(2,3));
        System.out.println("executing thread 1");

        System.out.println(thread2.add(2,3));
        System.out.println("executing thread 2");
    }
}
