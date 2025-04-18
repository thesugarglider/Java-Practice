package com.sugarglider.threadsandconcurrency;

public class Example12 extends Thread{

    @Override
    public void run() {
        for (int i = 1; i<=5 ; i++){
            System.out.print(" 1 ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
