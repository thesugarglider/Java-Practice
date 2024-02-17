package com.sugarglider.arrays.exercise.practice;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[5] = 50;
        System.out.println(Arrays.toString(array));

        double[] doubles = new double[10];
        doubles[3] = 3.5;
        System.out.println(doubles[3]);

        int firstTen[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first = "+firstTen[0]);
        System.out.println("last = "+ firstTen[array.length-1]);

        if(array.length%2==0){
            System.out.print("Array Lenght is Even ");
            System.out.println("So the middle element are " + firstTen[array.length/2 - 1] + ", " + firstTen[array.length/2]) ;
        } else {
            System.out.println("Middle element is " + firstTen[array.length/2]);
        }

    }
}
