package com.sugarglider.arrays.exercise.practice;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {
        String names[] = {"Ranga", "Pravin", "Rahul", "Ram"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        if(Arrays.binarySearch(names,"Ram") >= 0){
            System.out.println("Ram was found in the list");
        }

        int firstArray[] = {1,2,3,4,5};
        int secondArray[] = {1,2,3,4,5,6};

        if(Arrays.equals(firstArray,secondArray)){
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
