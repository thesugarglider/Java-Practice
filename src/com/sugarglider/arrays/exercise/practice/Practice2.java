package com.sugarglider.arrays.exercise.practice;

public class Practice2 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0 ; i < array.length ; i++){
            array[i] = i;
        }

        Object objectVariable = array;

        if(objectVariable instanceof int[]){
            System.out.println("Object is really an int array");
        }
    }
}
