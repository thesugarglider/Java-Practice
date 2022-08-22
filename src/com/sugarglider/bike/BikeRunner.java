package com.sugarglider.bike;

public class BikeRunner {
    public static void main(String[] args) {
        Bike ducati = new Bike((short)100);

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
