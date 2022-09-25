package com.sugarglider.arrays.exercise.weekdays;

public class WeekDays {
    public static void main(String[] args) {
        String[] weekDays = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        int longest = 0;
       for(int i=0;i<weekDays.length-1;i++){
           if(weekDays[longest].length()<weekDays[i+1].length()){
               longest = i;
           }

       }
        System.out.println("Day with longest character: "+weekDays[longest]+", "+"length: "+weekDays[longest].length());

       for(int i= weekDays.length-1;i>=0;i--){
           System.out.print(weekDays[i]+" ");
       }
    }
}
