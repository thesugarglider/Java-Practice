package com.sugarglider.collections.list.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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

        gettingElements(placeToVisit);

        //printItenary2(placeToVisit);
        printItenary3(placeToVisit);
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

    private static void gettingElements(LinkedList<String> list){
        list.get(1);

        System.out.println("First Element -> " + list.getFirst());
        System.out.println("Last Element -> " + list.getLast());

        System.out.println("Kashi is at position -> " + list.indexOf("Kashi"));

        //Queue retrieval method
        System.out.println("Element from element() -> " + list.element());

        //Stack retrieval method
        System.out.println("Peek -> " + list.peek());
        System.out.println("Peek First -> " + list.peekFirst());
        System.out.println("Peek Last -> " + list.peekLast());
    }

    private static void printItenary2(LinkedList<String> list){

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list){
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

    }

    private static void printItenary3(LinkedList<String> list){

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);

        while (iterator.hasNext()){
            String town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
        }

        System.out.println("Trip ends at " + list.getLast());
    }
}
