package com.sugarglider.arrays.exercise.practice;

import java.util.Arrays;
import java.util.Random;

public class Practice5 {
    public static void main(String[] args) {
        int firstArray[] = getRandomArray(5);
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(reverseArray(firstArray)));
    }

    public static int[] getRandomArray(int len){
        Random random = new Random();
        int array[] = new int[len];

        for(int i = 0 ; i < array.length ; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static int[] reverseArray(int[] originalArray){
        int temp[] = new int[originalArray.length];
        int count = 0;
        for ( int i = originalArray.length - 1 ; i >= 0 ; i--){
                temp[count++] = originalArray[i];
        }
        originalArray = temp;
        return  originalArray;
    }
}
