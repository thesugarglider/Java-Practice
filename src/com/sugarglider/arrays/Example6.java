//variable arguments

package com.sugarglider.arrays;

import java.util.Arrays;

public class Example6 {

    public static int sum(int... numbers){
        int sum=0;
        for(int number:numbers){
            sum+=number;
        }
        System.out.print(Arrays.toString(numbers)+"-> ");
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
    }
}
