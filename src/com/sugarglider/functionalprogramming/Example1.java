package com.sugarglider.functionalprogramming;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = List.of("Apple","Banana","Dog","Cat");

        //printBasic(list);
        //printWithFP(list);
        //printBasicFiltering(list);
        printWithFPFiltering(list);
    }

     public static void printBasic(List<String> list) {
        for(String word: list){
            System.out.println(word);
        }
    }
    
    public static void printWithFP(List<String> list){

        list.stream().forEach(element -> System.out.println(element));
    }

    public static void printBasicFiltering(List<String> list){
        for(String word:list){
            if(word.endsWith("at")){
                System.out.println(word);
            }
        }
    }

    public static void printWithFPFiltering(List<String> list){
        list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
    }
    
    
}
