package com.sugarglider.conditional.switchcase.calendar;

public class Calendar {
    private  int noOfDay;
    private  int noOfMonth;

    Calendar(int noOfDay, int noOfMonth){
        this.noOfDay = noOfDay;
        this.noOfMonth = noOfMonth;
    }

    public  void isWeekDay(){
        switch(noOfDay){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a week day");
                break;
            case 6:
            case 0:
                System.out.println("It is a Weekend");
                break;
            default:
                System.out.println("Invalid number");
        }
    }

    public  void nameOfMonth(){
        switch (noOfMonth){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }

    public void nameOfTheDay(){
        switch (noOfDay){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Number");
        }
    }
}
