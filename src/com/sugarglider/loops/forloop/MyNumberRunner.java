package com.sugarglider.loops.forloop;

public class MyNumberRunner {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(5);

        System.out.println("isPrime: "+number.isPrime());

        System.out.println("sumUptoN: "+number.sumUptoN());

        System.out.println("sumOfDivisors: "+number.sumOfDivisors());

        System.out.println("printTriangle");
        number.printTriangle();
    }
}
