package com.sugarglider.datatypes.character;

public class MyCharRunner {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('a');
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isDigit());
        System.out.println(myChar.isAlphabet());
    }
}
