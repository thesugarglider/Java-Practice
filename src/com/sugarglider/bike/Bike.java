package com.sugarglider.bike;

public class Bike {
    private short speed;

    public void setSpeed(short speed){
        if (speed > 0)
            this.speed = speed;
    }

    public short getSpeed(){
        return  this.speed;
    }

    public void startBike(){
        System.out.println("Bike Started....");
    }
}
