package com.sugarglider.bike;

public class Bike {
    private int speed;

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void startBike(){
        System.out.println("Bike Started....");
    }
}
