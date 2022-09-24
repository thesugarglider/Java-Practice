package com.sugarglider.references.strings;

public class StringExample6 {
    public static void main(String[] args) {
        String myName = new String();

        System.out.println("The String "+myName);

        System.out.println("Is the string null?"+(myName==null));

        System.out.println("Is the string blank?"+myName.isBlank());

        System.out.println("Is the string empty?"+myName.isEmpty());


    }
}
