package com.sugarglider.datatypes.exercises;

/**
 * use the pythogorean theorem to find the hypotenuse given the length of two opposite sides
 */
public class Hypotenuse {
    public static void main(String[] args) {
        double x,y,z;
        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);

        System.out.println("Hypotenuse is "+z);
    }
}
