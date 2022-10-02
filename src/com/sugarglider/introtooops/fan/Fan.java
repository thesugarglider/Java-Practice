package com.sugarglider.introtooops.fan;

public class Fan {
    private String manufacturer;
    private double radius;
    private String color;

    private boolean isOn;
    private byte speed;

    Fan(String manufacturer, double radius, String color){
        this.manufacturer = manufacturer;
        this.radius = radius;
        this.color = color;
    }

    public void switchOn(){
        this.isOn = true;
    }

    public void switchOff(){
        this.isOn = false;
        setSpeed((byte)0);
    }

    public void setSpeed(byte speed){
        this.speed = speed;
    }

    @Override
    public String toString(){
        return String.format("manufacturer - %s, radius - %f, color - %s, speed - %d, isOn - %b", manufacturer,radius,color,speed,isOn);
    }
}
