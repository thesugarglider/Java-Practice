package com.sugarglider.exceptionhandling;

public class Example3 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        method2();
        System.out.println("method 1 ended");
    }

    private static void method2() {
        try{
//            String str = null;
//            str.length();

            int a[] =  {1,2};
            System.out.println(a[2]);
            System.out.println("method 2 ended");
        }catch (NullPointerException ex){
            System.out.println("null pointer exception");
            ex.printStackTrace();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
