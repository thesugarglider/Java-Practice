package com.sugarglider.javanewfeatures;

public class Example4 {
    public static void main(String[] args) {
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(" L R".strip());
        System.out.println(" L R ".strip().replace(" ","@"));
        System.out.println(" L R ".stripLeading().replace(" ","@"));
        System.out.println(" L R ".stripTrailing().replace(" ","@"));

        //System.out.println("UPPER".transform(s -> s.substring(2)));
        System.out.println("My Name is %s and my age is %d".formatted("Pravin",24));

        String str = null;
        System.out.println(str.isBlank());

    }
}
