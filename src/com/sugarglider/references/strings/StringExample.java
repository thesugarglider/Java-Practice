package com.sugarglider.references.strings;

public class StringExample {
    public static void main(String[] args) {
        String str = "Test";
        //System.out.println(str.length());

        String biggerString = "This is a lot of string";
        //System.out.println(biggerString.charAt(5));

//        for (int i=0;i<biggerString.length();i++){
//            System.out.println(biggerString.charAt(i));
//        }
        System.out.println(biggerString.indexOf('i'));
        System.out.println(biggerString.lastIndexOf('i'));
        System.out.println(biggerString.contains("of"));
        System.out.println(biggerString.startsWith("this"));
        System.out.println(biggerString.endsWith("string"));
        System.out.println(biggerString.isEmpty());
        System.out.println(biggerString.isBlank());

        String anotherString = null;
        //System.out.println(anotherString.isBlank());

        String anotherAnotherString = "hello";
        System.out.println(anotherAnotherString.equals("hello"));
        System.out.println(anotherAnotherString.equals("Hello"));
        System.out.println(anotherAnotherString.equalsIgnoreCase("Hello"));
    }

}
