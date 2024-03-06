package com.sugarglider.collections.list.practice;

import java.util.LinkedList;

public class Practice1 {
    public static void main(String[] args) {
        LinkedList<String> placeToVisit = new LinkedList<>();

        placeToVisit.add("Ayodhya");
        placeToVisit.add(0, "Kashi");

        System.out.println(placeToVisit);

        addMoreElements(placeToVisit);
        System.out.println(placeToVisit);

        removeElements(placeToVisit);
        System.out.println(placeToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Pravin");
        list.addLast("Hobart");

        //Queue methods
        list.offer("Mathura");
        list.offerFirst("Swarved");
        list.offerLast("Ramnagar");

        //Stack methods
        list.push("Telegram");

    }

    private static void removeElements(LinkedList<String> list){
        list.remove(); // removes first element
        list.remove(4);
        list.remove("Ramnagar");

        list.removeFirst(); //removes first element
        list.removeLast();  //removes last element

        list.pop();
    }
}
