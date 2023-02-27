package com.sugarglider.exceptionhandling.practice;

public class Divider {
    public void divide(int a, int b) throws DivideByZeroException {
            if(b==0){
                throw new DivideByZeroException("B can't be Zero");
            }else {
                System.out.println("a+b="+(a/b));
            }
    }
}
