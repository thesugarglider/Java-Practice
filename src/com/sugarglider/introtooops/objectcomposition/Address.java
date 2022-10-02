package com.sugarglider.introtooops.objectcomposition;

public class Address {
    private String line;
    private String city;
    private int zip;

    public Address(String line, String city, int zip) {
        this.line = line;
        this.city = city;
        this.zip = zip;
    }

    public String toString(){
        return String.format("%s %s %d",line,city,zip);
    }
}
