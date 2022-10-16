package com.sugarglider.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample5 {
    public static void main(String[] args) {
        List<String> words = List.of("Yak","Zebra","Bat","Cat");

        List<String> wordsArrayList = new ArrayList<>(words);

        //print the words ending with "at"
        for (String word:words){
            if (word.endsWith("at")){
                System.out.println(word);
            }
        }

        System.out.println();

        //delete the words ending the "at"
        Iterator<String> iterator = wordsArrayList.iterator();
        while (iterator.hasNext()){
            if (iterator.next().endsWith("at")){
                iterator.remove();
            }
        }

        System.out.println(wordsArrayList);
    }
}
