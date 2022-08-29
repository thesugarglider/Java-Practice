package com.sugarglider.conditional.switchcase.calendar;

import java.util.Scanner;

public class CalendarRunner {
    public static void main(String[] args) {
        int noOfDay;
        int noOfMonth;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number of Day");
        noOfDay = scanner.nextInt();

        System.out.println("Enter Number of Month");
        noOfMonth = scanner.nextInt();

        Calendar cal = new Calendar(noOfDay, noOfMonth);
        cal.isWeekDay();
        cal.nameOfMonth();
    }
}
