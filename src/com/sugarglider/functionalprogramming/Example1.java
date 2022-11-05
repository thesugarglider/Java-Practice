package com.sugarglider.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = List.of("Apple","Banana","Dog","Cat");

        //printBasic(list);
        printWithFP(list);
    }

     public static void printBasic(List<String> list) {
        for(String word: list){
            System.out.println(word);
        }
    }
    
    public static void printWithFP(List<String> list){

        list.stream().forEach(element -> System.out.println(element));
    }
    
    
}
