package com.sugarglider.exceptionhandling;

/**
 * @example finally keyword
 */

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try{
           scanner =  new Scanner(System.in);
           int a[] = {1,2,3,4,5};
           System.out.println(a[6]);
        } catch (Exception exception){
            exception.printStackTrace();
        } finally {
            if(scanner!=null){
                scanner.close();
            }

        }

    }
}
