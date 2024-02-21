package com.sugarglider.arrays.exercise.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        int[] numbers = readIntegers();
        System.out.println(Arrays.toString(numbers));

        int minimum = findMin(numbers);
        System.out.println("min = " + minimum);
    }

    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer values separated by comma");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length ; i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] numbers){
        int min = Integer.MAX_VALUE;

        for (int number : numbers){
            if(number < min){
                min = number;
            }
        }

        return min;
    }
}
