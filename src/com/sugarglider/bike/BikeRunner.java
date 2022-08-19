package com.sugarglider.bike;

public class BikeRunner {
    public static void main(String[] args) {
        Bike ducati = new Bike();

        ducati.startBike();
        ducati.setSpeed((short)80);
        System.out.println(ducati.getSpeed()+" kmph");
    }
}
