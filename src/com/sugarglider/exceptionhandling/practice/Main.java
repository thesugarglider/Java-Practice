package com.sugarglider.exceptionhandling.practice;


public class Main {
    public static void main(String[] args) throws DivideByZeroException {
        Divider divider = new Divider();
        divider.divide(10, 0);
    }
}
