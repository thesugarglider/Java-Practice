package com.sugarglider.datatypes.boxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 5;

        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a','b','c','d'};
        System.out.println(Arrays.toString(characterArray));

        List<Integer> list = returnList(1,2,3,4,5);
        System.out.println(list);
    }

    private static ArrayList<Integer> returnList(int... varArgs){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : varArgs){
            arrayList.add(i);
        }
        return arrayList;
    }

    private static int returnAnInt(Integer i){
        return i;
    }

    private static Integer returnAnInteger(int i){
        return i;
    }

}
