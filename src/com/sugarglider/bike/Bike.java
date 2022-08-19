package com.sugarglider.bike;

public class Bike {
    private short speed;

    public void setSpeed(short speed){
        this.speed = speed;
    }

    public short getSpeed(){
        return this.speed;
    }

    public void startBike(){
        System.out.println("Bike Started....");
    }
}
