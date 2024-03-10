package com.sugarglider.collections.list.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Practice2 {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        List<String> list = List.of("Kashi", "Ayodhya", "Mathura", "Kedarnath", "Badrinath", "Taj Mahal");
        placesToVisit.addAll(list);
        placeIterator(placesToVisit);
    }

    private static void placeIterator(LinkedList<String> list){
        ListIterator<String>  iterator = list.listIterator();

        while (iterator.hasNext()){
            if(iterator.next().equals("Taj Mahal")){
                iterator.remove();
            }
            //System.out.println(iterator.next());
        }
        iterator.add("Uttar Kashi");

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        System.out.println(list);

        ListIterator<String> iterator1 = list.listIterator(3);
        //System.out.println(iterator1.next());
        System.out.println(iterator1.previous());

    }
}
