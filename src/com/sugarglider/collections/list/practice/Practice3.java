package com.sugarglider.collections.list.practice;


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Scanner;

record Place(String place, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d km)" , place, distance );
    }
}

public class Practice3 {
    public static void main(String[] args) {

        LinkedList<Place> placeToVisit = new LinkedList<>();

        Place kashi = new Place("Kashi", 1552);
        addPlace(placeToVisit, kashi);
        addPlace(placeToVisit, new Place("kashi", 1554));
        addPlace(placeToVisit, new Place("Ayodhya", 1553));
        addPlace(placeToVisit, new Place("Mathura", 1554));

        placeToVisit.addFirst(new Place("Babatpur", 0));

        System.out.println(placeToVisit);

        String menu = """
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit
                """;

        System.out.println(menu);

        ListIterator<Place> listIterator = placeToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        while(!quitLoop){
            if(!listIterator.hasPrevious()){
                System.out.println("Originating : " + listIterator.next());
                forward = true;
            }

            if(!listIterator.hasNext()){
                System.out.println("Final : " + listIterator.previous());
                forward = false;
            }

            System.out.println("Enter value : ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);

            switch (menuItem){
                case "F" :
                    System.out.println("user wants to go forward");
                    if(listIterator.hasNext()){
                        System.out.println(listIterator.next());
                    }
                    break;

                case "B" :
                    System.out.println("user wants to go backward");
                    if(listIterator.hasPrevious()){
                        System.out.println(listIterator.previous());
                    }
                    break;

                case "M" :
                    System.out.println("list the menu");
                    System.out.println(menu);
                    break;

                case "L" :
                    System.out.println(placeToVisit);
                    break;


                default : quitLoop = true;
                          break;
            }
        }

    }

    private static void addPlace(LinkedList<Place> list, Place place){

        if(list.contains(place)){
            System.out.println("Found duplicate " + place);
            return;
        }

        for (Place p : list){
            if(p.place().equalsIgnoreCase(place.place())){
                System.out.println("Found Duplicate " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for (Place place1 : list){
            if(place.distance() <  place1.distance()){
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }
}
