package com.sugarglider.bike;

public class Bike {
    private short speed;

    public void setSpeed(short speed){
        if (speed >= 0)
            this.speed = speed;
        else
            System.out.println("Can't Decrease Speed");
    }

    public short getSpeed(){
        return  this.speed;
    }

    public void increaseSpeed(short howMuch){
        setSpeed((short) (this.speed + howMuch));
        System.out.println("Now the speed is "+this.speed+" kmph");
    }

    public void decreaseSpeed(short howMuch) {
        setSpeed((short) (this.speed - howMuch));
        System.out.println("Now the speed is "+this.speed+" kmph");
    }

    public void startBike(){
        System.out.print("Bike Started....");
    }
}
