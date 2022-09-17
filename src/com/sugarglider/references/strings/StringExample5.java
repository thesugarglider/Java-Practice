package com.sugarglider.references.strings;

public class StringExample5 {
    public static void main(String[] args) {
        String myName = null;
        String nullString = null;

        if(myName == null){
            System.out.println("The String = "+myName);
        }

        if(myName == nullString){
            System.out.println("Both String = "+nullString);
        }

        myName = "pravin";
        if(myName != null){
            System.out.println("The String = "+myName);
        }


    }
}
