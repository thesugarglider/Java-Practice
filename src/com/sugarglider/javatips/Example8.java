package com.sugarglider.javatips;

public class Example8 {
    private final String name;
    private static int count;
    public static int getCount() {
        return count;
    }

    public Example8(String name) {
        this.name = name;
        count++;
    }


}
