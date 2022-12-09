package com.sugarglider.threadsandconcurrency;

public class Example5 extends Thread {
    public synchronized int add(int a, int b){
        return a+b;
    }
}
