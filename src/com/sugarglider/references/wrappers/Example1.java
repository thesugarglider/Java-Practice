package com.sugarglider.references.wrappers;

public class Example1 {
    public static void main(String[] args) {
       // Integer i1 = new Integer(5);
       // Integer i2 = new Integer(5);

       // System.out.println(i1==i2);

        Integer i3 = Integer.valueOf(5);
        Integer i4 = Integer.valueOf(5);

        System.out.println(i3==i4);

        Integer i5 = Integer.valueOf("5");
        System.out.println(i5);
    }
}
