package com.sugarglider.javanewfeatures;

public class Example {
    public static void main(String[] args) {
        System.out.println(findTheDayOfWeekSwitchStatement(1));
        System.out.println(findTheDayOfTheWeekSwitchExpression(1));
    }

    private static String findTheDayOfWeekSwitchStatement(int day) {
        String dayOfTheWeek = "";
        switch(day){
            case 0 : dayOfTheWeek = "Sunday";break;
            case 1 : dayOfTheWeek = "Monday";break;
            case 2 : dayOfTheWeek = "Tuesday";break;
            case 3 : dayOfTheWeek = "Wednesday";break;
            default: throw new IllegalArgumentException("Invalid Option "+ day);
        }

        return dayOfTheWeek;
    }

    private static String findTheDayOfTheWeekSwitchExpression(int day) {
        String dayOfTheWeek = switch (day){
            case 0 -> {
                System.out.println("do some complex logic here");
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> throw new IllegalArgumentException("Invalid option "+day);
        };
        return dayOfTheWeek;
    }
}
