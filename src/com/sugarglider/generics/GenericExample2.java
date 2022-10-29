package com.sugarglider.generics;


import java.util.ArrayList;
import java.util.List;

public class GenericExample2 {

    static <X> X doubleValue(X value){
        return value;
    }

    static <X extends List> void duplicateValue(X list){
        list.addAll(list);
    }

    public static void main(String[] args) {
        MyCustomList2<Integer> list = new MyCustomList2<>();
        list.addElement(5);
        list.addElement(6);
        System.out.println(list.toString());

        MyCustomList2<Long> list2 = new MyCustomList2<>();
        list2.addElement(3l);
        list2.addElement(7l);
        System.out.println(list2.toString());

        String str = doubleValue(new String());
        Integer integer = doubleValue(5);
        ArrayList list3 = doubleValue(new ArrayList<>());

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3));
        duplicateValue(numbers);
        System.out.println(numbers);
    }
}

