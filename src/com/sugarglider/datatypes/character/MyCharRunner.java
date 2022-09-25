package com.sugarglider.datatypes.character;

public class MyCharRunner {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('a');
        if(myChar.isVowel()){
            System.out.println("It is vowel");
        }

        if(myChar.isDigit()){
            System.out.println("It is digit");
        }
        if(myChar.isAlphabet()){
            System.out.println("It is alphabet");
        }

        if(myChar.isConsonant()){
            System.out.println("It is consonant");
        }

    }
}
