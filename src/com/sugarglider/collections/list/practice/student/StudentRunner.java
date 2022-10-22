package com.sugarglider.collections.list.practice.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(2,"Ranga"), new Student(100,"Adam"), new Student(1,"Eve"));

        List<Student> studentArrayList = new ArrayList<>(students);

        System.out.println(students);

        Collections.sort(studentArrayList);
        System.out.println("Descending Order -> "+studentArrayList);

        Collections.sort(studentArrayList, new AscendingSort());
        System.out.println("Ascending Order -> "+studentArrayList);

    }
}
