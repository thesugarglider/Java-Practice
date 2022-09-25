//variable arguments
package com.sugarglider.arrays;

public class Example6 {
    public static int sum(int... numbers){
        int sum=0;
        for(int number:numbers){
            sum+=number;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));
    }
}
