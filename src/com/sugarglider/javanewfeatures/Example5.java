package com.sugarglider.javanewfeatures;

import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> names1 = List.of("Ranga","Rahul");
        List<String> names2 = List.of("Satish","Kumar");

        List<List<String>> names = List.of(names1,names2);
        names.stream().forEach(System.out::println);

        var names3 = List.of(names1,names2);
        names3.stream().forEach(System.out::println);
    }
}
