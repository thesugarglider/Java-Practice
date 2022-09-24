//fill, compare and sort

package com.sugarglider.arrays;

import java.util.Arrays;

public class Example5 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        //fill
        Arrays.fill(marks,100);
        System.out.println(Arrays.toString(marks));

        //compare
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[] array3 = {3,2,1};
        System.out.println(Arrays.equals(array1,array2));
        System.out.println(Arrays.equals(array1,array3));

        //sort
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array3));
    }
}
