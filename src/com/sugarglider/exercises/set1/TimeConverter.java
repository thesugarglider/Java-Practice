package com.sugarglider.exercises.set1;

public class TimeConverter {

    static final int MINUTES = 60;
    static final int DAY = 24;
    public static int convertHoursToMinutes(int hours){
        if (hours < 0){
            return -1;
        }
        return hours * MINUTES;
    }

    public static int convertDaysToMinutes(int days){
        if (days < 0){
            return -1;
        }
        return days * DAY * MINUTES;
    }
}
