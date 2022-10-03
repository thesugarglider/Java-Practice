package com.sugarglider.introtooops.inheritence;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("Ranga","Programmer Analyst");
        employee.setEmail("ranga@in28minutes.com");
        employee.setNumber(123456789);
        employee.setEmployerGrade('A');
        System.out.println(employee);
    }
}
