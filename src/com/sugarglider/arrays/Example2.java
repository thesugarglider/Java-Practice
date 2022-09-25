package com.sugarglider.arrays;

public class Example2 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        System.out.print("Initially the array is: ");
        for (int mark:marks){
            System.out.print(mark+" ");
        }

        System.out.println();

        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        marks[3] = 4;
        marks[4] = 5;

        System.out.print("Now the array is: ");
        for (int mark:marks){
            System.out.print(mark+" ");
        }
        System.out.println();

        System.out.println("Also the length of array is "+marks.length);
    }
}
