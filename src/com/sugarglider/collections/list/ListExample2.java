package com.sugarglider.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample2 {
    public static void main(String[] args) {
        List<String> words = List.of("Apple","Cat","Dog");
        System.out.println(words);

        List<String> wordsArrayList = new ArrayList<String>(words);
        wordsArrayList.add("Mango");
        System.out.println(wordsArrayList);

        List<String> wordLinkedList = new LinkedList<String>(words);
        System.out.println(wordLinkedList.size());

        List<String> wordVector = new Vector<String>(words);
        System.out.println("Vector -> "+wordVector);

    }
}
