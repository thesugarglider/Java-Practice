package com.sugarglider.collections.map;

//Given a string "This is a string" find the occurrences of each character and each word.

import java.util.HashMap;
import java.util.Map;

public class MapExample3 {
    public static void main(String[] args) {
        String str = "This is a string";
        System.out.println(str);
        Map<Character, Integer> occurrences = new HashMap<>();
        char[] characters = str.toCharArray();


        for(char character:characters){
            Integer count = occurrences.get(character);
            if(occurrences.containsKey(character)){
                occurrences.put(character,count+1);
            }else {
                occurrences.put(character,1);
            }
        }
        System.out.println(occurrences);


        Map<String, Integer> stringOccurrences = new HashMap<>();
        String[] words = str.split(" ");

        for(String word:words){
            Integer count = stringOccurrences.get(word);
            if(stringOccurrences.containsKey(word)){
                stringOccurrences.put(word,count+1);
            }else {
                stringOccurrences.put(word,1);
            }
        }
        System.out.println(stringOccurrences);

    }
}
