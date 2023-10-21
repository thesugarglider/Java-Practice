package com.sugarglider.functionalprogramming;

import java.util.List;

public class Example20 {
    public static void main(String[] args) {
        List<String> words = List.of("Ant","Cat","Dog","Elephant");

        words.stream().map(word->word.length()).forEach(length ->System.out.println(length));
        words.stream().map(String::length).forEach(Example20Reference::print);

        List<Integer> numbers = List.of(2,3,4,5,6,7,8);
        Integer max = numbers.stream().filter(n->n%2==0).max((n1,n2)->Integer.compare(n1,n2)).orElse(0);
        System.out.println(max);

        max = numbers.stream().filter(Example20Reference::isEven).max(Integer::compare).orElse(0);
        System.out.println(max);
    }
}
