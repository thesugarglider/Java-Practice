package com.sugarglider.arrays.exercise.practice;

import java.util.Arrays;

public class Practice11 {
    public static void main(String[] args) {
        Object[] objectArray = new Object[3];

        objectArray[0] = new String[] {"a", "b", "c"};

        objectArray[1] = new String[][] {{"a", "b"},
                {"c", "d" , "e"},
                {"f", "g", "h"}};

        objectArray[2] = new int[2][2][2];

        System.out.println(Arrays.deepToString(objectArray));
    }
}
