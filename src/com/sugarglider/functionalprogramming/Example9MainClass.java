package com.sugarglider.functionalprogramming;

import java.util.List;

public class Example9MainClass {
    public static void main(String[] args) {
        List.of(1,2,3,4).stream().map(element -> element*element).forEach(element -> System.out.print(element+" "));

        System.out.println();

        List.of(1,2,3,4).stream().map(new Example9()).forEach(element -> System.out.print(element+" "));
    }
}
