package com.sugarglider.arrays.exercise;

import java.util.Arrays;

public class StudentRunner {
    public static void main(String[] args) {
        int[] listOfMarks = {99,100,97};
        Student student = new Student("Rahul", listOfMarks);
        System.out.println("Name of the student: "+student.getName());
        System.out.println("Number of subjects: "+student.getNumberOfMarks());
        System.out.println("Marks are: "+Arrays.toString(student.getMarks()));
        System.out.println("Maximum mark: "+student.getMaximumMark());
        System.out.println("Minimum mark:"+student.getMinimumMark());
        System.out.println("Average of the marks: "+student.getAverageOfMarks());

    }
}
