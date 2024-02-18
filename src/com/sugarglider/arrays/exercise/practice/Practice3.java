package com.sugarglider.arrays.exercise.practice;

import java.util.Arrays;
import java.util.Random;

public class Practice3 {
    public static void main(String[] args) {
        int firstArray[] = getRandom(3);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int secondArray[] = new int[3];
        Arrays.fill(secondArray, 2);
        System.out.println(Arrays.toString(secondArray));

        int thirdArray[] = getRandom(3);
        System.out.println(Arrays.toString(thirdArray));

        int fourthArray[] = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        int fifthArray[] = Arrays.copyOf(thirdArray, 2);
        System.out.println(Arrays.toString(fifthArray));

        int sixthArray[] = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(sixthArray));

    }

    public  static int[] getRandom(int len){
        Random random = new Random();
        int array[] = new int[len];

        for(int i = 0 ; i < array.length ; i++){
            array[i] = random.nextInt(100);
        }

        return array;
    }

}
