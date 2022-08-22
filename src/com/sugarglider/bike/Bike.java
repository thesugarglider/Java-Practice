package com.sugarglider.bike;

public class Bike {
    private short speed;

    Bike(short speed){
        this.speed = setSpeed(speed);
    }

    public short setSpeed(short speed){
        if (speed >= 0) {
            this.speed = speed;
            return this.speed;
        }
        else
            return 0;
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
