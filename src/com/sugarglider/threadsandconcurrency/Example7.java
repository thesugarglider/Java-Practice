package com.sugarglider.threadsandconcurrency;

public class Example7 extends Thread{


    private int number;

    Example7(int number){
        this.number = number;
    }
    public void run(){
        System.out.println("task "+number+" started");
        for (int i=number*100;i<=number*100+5;i++){
            System.out.println(i);
        }
        System.out.println("task "+number+" done");
    }

}
