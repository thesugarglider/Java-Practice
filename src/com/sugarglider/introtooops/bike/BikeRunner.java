package com.sugarglider.introtooops.bike;

import com.sugarglider.introtooops.bike.Bike;

public class BikeRunner {
    public static void main(String[] args) {
        Bike ducati = new Bike((short)100);
        Bike honda = new Bike();

        ducati.startBike();
        //ducati.setSpeed((short)80);
        System.out.println("Speed is "+ducati.getSpeed()+" kmph");
        System.out.print("Increasing Speed.....");
        ducati.increaseSpeed((short)20);
        //System.out.println("Speed is "+ducati.getSpeed()+" kmph");
        System.out.print("Decreasing Speed.....");
        ducati.decreaseSpeed((short)10);

    }
}
