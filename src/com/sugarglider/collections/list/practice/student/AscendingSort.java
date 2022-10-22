package com.sugarglider.collections.list.practice.student;

import java.util.Comparator;

public class AscendingSort implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(),student2.getId());
    }
}
