package com.sugarglider.javanewfeatures;

public class Example7 {

    record Person(String name,String email, int phoneNumber){}
    public static void main(String[] args) {
        Person person = new Person("Ranga","ranga@in28minutes.com",987945);
        System.out.println(person);
        System.out.println(person.name);
        System.out.println(person.email());
    }
}
