package com.sugarglider.arrays.exercise.student;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {
    private String name;
    private int[] listOfMarks;
    Student(String name, int... listOfMarks){
        this.name = name;
        this.listOfMarks = listOfMarks;
    }

    public String getName(){
        return name;
    }

    public int getNumberOfMarks(){
        return listOfMarks.length;
    }

    public int[] getMarks(){
        return listOfMarks;
    }

    public BigDecimal getAverageOfMarks(){
        int sum=0;
        for (int mark:listOfMarks){
            sum+=mark;
        }


        return new BigDecimal(sum).divide(new BigDecimal(listOfMarks.length),3, RoundingMode.UP);
    }

    public int getMaximumMark(){
        Arrays.sort(listOfMarks);
        return listOfMarks[listOfMarks.length-1];
    }

    public int getMinimumMark(){
        Arrays.sort(listOfMarks);
        return listOfMarks[0];

    }

}
