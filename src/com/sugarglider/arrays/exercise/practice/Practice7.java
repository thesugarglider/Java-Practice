package com.sugarglider.arrays.exercise.practice;

public class Practice7 {
    public static void main(String[] args) {
        System.out.println("Hello World Again");

        String[] text = "Hello World Again".split(" ");
        printText(text);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "Again");

        String[] strArray = {"first", "second", "third", "fourth"};
        System.out.println(String.join(",",strArray));
    }

    private static void printText(String... textList){
        for (String text : textList){
            System.out.println(text);
        }
    }
}
