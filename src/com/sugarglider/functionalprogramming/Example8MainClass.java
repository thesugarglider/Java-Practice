package com.sugarglider.functionalprogramming;

import java.util.List;

public class Example8MainClass {
    public static void main(String[] args) {
        List.of(23,34,43,38).stream().filter(element -> element%2==0).forEach(element -> System.out.print(element+" "));

        System.out.println();

        List.of(23,34,43,38).stream().filter(element -> element%2==0).forEach(new Example8());
    }
}
