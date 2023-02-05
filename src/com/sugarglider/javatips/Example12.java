package com.sugarglider.javatips;

public enum Example12 {
    WINTER(1), SUMMER(2), SPRING(3), FALL(4);

    private int value;
    private Example12(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
