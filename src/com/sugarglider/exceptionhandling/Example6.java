package com.sugarglider.exceptionhandling;

public class Example6 {
    public static void main(String[] args) {
        try{
            someOtherMethod();
            Thread.sleep(2000);
        } catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }

        someOtherMethod2();

    }

    public static void someOtherMethod2() throws RuntimeException {

    }

    private static void someOtherMethod() throws InterruptedException {
        Thread.sleep(2000);
    }
}
