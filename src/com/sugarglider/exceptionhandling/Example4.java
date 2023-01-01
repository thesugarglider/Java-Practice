package com.sugarglider.exceptionhandling;

/**
 * @author pravin
 * @date 12-Dec-2022
 */
public class Example4 {
    public static void main(String[] args) {
        method1("");
    }

    public static void method1(String str){
        try{
            System.out.println(str.length());
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
