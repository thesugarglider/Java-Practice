package com.sugarglider.arrays.exercise.practice;

import java.util.Arrays;

public class Practice10 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        System.out.println(Arrays.toString(array));
        System.out.println("Array length " + array.length);

        for (int i = 0 ; i < array.length ; i++){
            for (int j = 0 ; j < array.length ; j++){
                array[i][j] = (i * 10) + (j + 1);
            }
        }
        System.out.print("Using Helper Class -> ");
        System.out.println(Arrays.deepToString(array));

        System.out.println("Using for each loop and helper class");
        for(int[] arr : array){
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("Using only for each loop");
        for(int[] arr : array){
            for(int element : arr){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
