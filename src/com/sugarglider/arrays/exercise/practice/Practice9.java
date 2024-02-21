package com.sugarglider.arrays.exercise.practice;

import java.util.Arrays;

public class Practice9 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(array)));
    }

    private static int[] reverse(int[] array){
        int[] temp = new int[array.length];
        int count = 0;

        for(int i = array.length - 1; i >= 0 ; i--){
            temp[count++] = array[i];
        }

        array = temp;
        return temp;
    }
}
