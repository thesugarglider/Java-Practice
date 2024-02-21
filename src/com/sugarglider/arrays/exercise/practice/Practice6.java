package com.sugarglider.arrays.exercise.practice;

import java.util.Arrays;

public class Practice6 {
    public static void main(String[] args) {
        int[] firstArray = new int[5];
        int[] secondArray = firstArray;

        System.out.println("My firstArray -> " + Arrays.toString(firstArray));
        System.out.println("My secondArray -> " + Arrays.toString(secondArray));

        firstArray[0] = 1;

        System.out.println("My firstArray after change" + Arrays.toString(firstArray));
        System.out.println("My secondArray after change" + Arrays.toString(secondArray));

        modifyArray(firstArray);

        System.out.println("My firstArray after change on method call" + Arrays.toString(firstArray));
        System.out.println("My secondArray after change on method call" + Arrays.toString(secondArray));
    }

    private static void modifyArray(int[] array){
        array[1] = 2;
    }
}
