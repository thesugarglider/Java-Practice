package com.sugarglider.functionalprogramming;

import java.util.List;

public class Example10 {
    public static void main(String[] args) {
        List.of("ant","cat","dog","sloth").stream().map(element -> element.length()).forEach(element -> System.out.print(element+" "));

        System.out.println();

        List.of("ant","cat","dog","sloth").stream().map(String::length).forEach(System.out::print);
    }
}
