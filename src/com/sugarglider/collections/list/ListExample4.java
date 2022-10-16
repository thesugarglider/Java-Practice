package com.sugarglider.collections.list;

import java.util.Iterator;
import java.util.List;

public class ListExample4 {
    public static void main(String[] args) {
        List<String> animals = List.of("Yak","Zebra","Cheetah","Leopard");

        for(int i=0;i<animals.size();i++){
            System.out.println(animals.get(i));
        }

        System.out.println();

        for (String animal:animals){
            System.out.println(animal);
        }

        System.out.println();

        Iterator animalIterator = animals.iterator();
        while (animalIterator.hasNext()){
            System.out.println(animalIterator.next());
        }
    }
}
