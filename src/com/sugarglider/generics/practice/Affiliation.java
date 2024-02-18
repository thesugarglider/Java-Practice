package com.sugarglider.generics.practice;

public record Affiliation(String name, String city, String country) {
    @Override
    public String toString() {
        return city + "(" + name + "," + country + ")";
    }
}
