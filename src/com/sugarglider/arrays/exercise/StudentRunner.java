package com.sugarglider.arrays.exercise;

import java.util.Arrays;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student("Rahul", 99,100,97);
        System.out.println("Name of the student: "+student.getName());
        System.out.println("Number of subjects: "+student.getNumberOfMarks());
        System.out.println("Marks are: "+Arrays.toString(student.getMarks()));
        System.out.println("Maximum mark: "+student.getMaximumMark());
        System.out.println("Minimum mark:"+student.getMinimumMark());
        System.out.println("Average of the marks: "+student.getAverageOfMarks());

        System.out.println();

        Student student1 = new Student("Shashi", 99,100,95,96);
        System.out.println("Name of the student: "+student1.getName());
        System.out.println("Number of subjects: "+student1.getNumberOfMarks());
        System.out.println("Marks are: "+Arrays.toString(student1.getMarks()));
        System.out.println("Maximum mark: "+student1.getMaximumMark());
        System.out.println("Minimum mark:"+student1.getMinimumMark());
        System.out.println("Average of the marks: "+student1.getAverageOfMarks());

    }
}
