package com.sugarglider.exercises.set1;

public class TimeConverter {

    static final int MINUTES = 60;
    static final int DAY = 24;
    public static int convertHoursToMinutes(int hours){
        return hours * MINUTES;
    }

    public static int convertDaysToMinutes(int days){
        return days * DAY * MINUTES;
    }
}
