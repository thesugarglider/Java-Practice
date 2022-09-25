package com.sugarglider.arrays;

import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        for(int mark:marks){
            System.out.print(mark+" ");
        }

        System.out.println();

        double[] values = new double[5];
        for(double value:values){
            System.out.print(value+" ");
        }

        System.out.println();

        boolean[] tests = new boolean[5];
        for(boolean test:tests){
            System.out.print(test+" ");
        }

        System.out.println();

        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
    }
}
