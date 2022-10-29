package com.sugarglider.generics;

public class GenericExample1 {
    public static void main(String[] args) {
        MyCustomList1<String> list = new MyCustomList1<>();
        list.addElement("Element 1");
        list.addElement("Element 2");
        String value = list.get(0);
        System.out.println(value);
        System.out.println(list);

        MyCustomList1<Integer> list2 = new MyCustomList1<>();
        list2.addElement(1);
        list2.addElement(2);
        list2.addElement(3);
        Integer value1 = list2.get(0);
        System.out.println(value1);
        System.out.println(list2);
    }

}

