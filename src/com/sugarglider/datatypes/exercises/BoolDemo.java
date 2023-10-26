package com.sugarglider.datatypes.exercises;

public class BoolDemo {
    public static void main(String[] args) {
        boolean b = false;

        b = true;
        if (b){
            System.out.println("This is executed");
        }

        b = false;
        if (b){
            System.out.println("This is not executed");
        }
    }
}
