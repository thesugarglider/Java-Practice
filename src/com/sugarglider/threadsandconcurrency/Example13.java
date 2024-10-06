package com.sugarglider.threadsandconcurrency;

public class Example13 {
    public static void main(String[] args) {

        System.out.println("Main start here");

        try{
            System.out.println("Main thread sleeping");
            Thread.sleep(1000);
        } catch (InterruptedException exception){
            exception.printStackTrace();
        }

        Thread thread = new Thread(() -> {
            String tname = Thread.currentThread().getName();
            for (int i=1; i<=10; i++){
                System.out.println(tname + " should take 10 dots to run");
                System.out.print(" . ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException exception){
                    System.out.println("Whoops " + tname + "interrupted");
                }
            }
            System.out.println(tname + " completed.");
        });


        System.out.println(thread.getName() + "starting");
        thread.start();

        System.out.println("Main Thread continues here");

        try{
            Thread.sleep(2000);
        } catch (InterruptedException exception){

        }

        thread.interrupt();
    }
}
