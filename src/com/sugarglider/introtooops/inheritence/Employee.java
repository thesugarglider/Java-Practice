package com.sugarglider.introtooops.inheritence;

public class Employee extends Person {
    private String title;
    private String employerName;
    private char employerGrade;
    private int salary;

    public Employee(String name, String title){
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public char getEmployerGrade() {
        return employerGrade;
    }

    public void setEmployerGrade(char employerGrade) {
        this.employerGrade = employerGrade;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString(){
        return String.format("Name [%s], Email [%s], Phone [%d], Grade [%c]",super.getName(),super.getEmail(),super.getNumber(),employerGrade);
    }

}
