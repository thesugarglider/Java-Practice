package com.sugarglider.references.strings;

public class StringExample8 {
    public static void main(String[] args) {
        String s = "hello world!";
        System.out.println("s -> " + s);

        System.out.println();

        //Comparison
        System.out.println("s.equals(\"HELLO WORLD!\") " + s.equals("HELLO WORLD!"));
        System.out.println("s.equalsIngoreCase(\"HELLO WORLD!\") " + s.equalsIgnoreCase("HELLO WORLD!"));
        System.out.println("s.compareTo(\"HELLO WORLD\") " + s.compareTo("HELLO WORLD!"));

        //Searching
        System.out.println("s.contains(\"HELLO WORLD!\") " + s.contains("HELLO WORLD!"));
        System.out.println("s.contains(\"hello world!\") " + s.contains("hello world!"));
        System.out.println("s.startsWith(\"hello world!\") " + s.startsWith("hello world!"));
        System.out.println("s.indexOf(\"lo\") " + s.indexOf("lo"));
        System.out.println("s.indexOf(\"o\") " + s.indexOf('o'));
        System.out.println("s.lastIndexOf(\"o\") " + s.lastIndexOf('o'));
        System.out.println("s.endsWith(\"!\") " + s.endsWith("!"));

        //extracting individual characters
        System.out.println("s.chartAt(0) " + s.charAt(0));

        //extracting substrings
        System.out.println("s.substring(4) " + s.substring(4));
        System.out.println("s.substring(4,9) " + s.substring(4,9));

        //case conversion (string is immutable, so only copy is returned)
        System.out.println("s.toUpperCase() " + s.toUpperCase());
        System.out.println("s.toLowerCase() " + s.toLowerCase());

        System.out.println("s.trim() " + s.trim());

        System.out.println("s.replaceAll(\"o\", \"r\") "+ s.replaceAll("o", "r"));

        String[] sa = s.split("o");
        for (String temp : sa) {
            System.out.println(temp);
        }

        //convert any other data type into string.
        System.out.println("String.valueOf(1) " + String.valueOf(1));
    }
}
