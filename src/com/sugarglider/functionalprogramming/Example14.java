package com.sugarglider.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example14 {
    public static void main(String[] args) {
        IntStream.range(1,11).map(e->e*e).forEach(e-> System.out.println(e));

        List<String> words = List.of("Apple", "Ant", "Cat");
        words.stream().map(word->word.toLowerCase()).forEach(word-> System.out.println(word));

        words.stream().forEach(element -> System.out.println(element.length()));
    }
}
