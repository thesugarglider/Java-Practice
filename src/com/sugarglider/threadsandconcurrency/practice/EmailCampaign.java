package com.sugarglider.threadsandconcurrency.practice;

public class EmailCampaign implements Runnable{
    @Override
    public void run() {
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(Thread.currentThread().getName());
            if (i==5){
                Thread.yield();
            }
        }
    }
}
