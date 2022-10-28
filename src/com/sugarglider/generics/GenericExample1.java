package com.sugarglider.generics;

import java.util.ArrayList;

public class GenericExample1 {
    public static void main(String[] args) {
        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("Element 1");
        list.addElement("Element 2");
        String value = list.get(0);
        System.out.println(value);
        System.out.println(list);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(1);
        list2.addElement(2);
        list2.addElement(3);
        Integer value1 = list2.get(0);
        System.out.println(value1);
        System.out.println(list2);
    }

}

class MyCustomList<T>{
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }

    public String toString(){
        return list.toString();
    }

    public T get(int i) {
        return list.get(i);
    }
}
