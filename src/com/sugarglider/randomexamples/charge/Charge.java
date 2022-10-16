package com.sugarglider.randomexamples.charge;

public class Charge {
    private double rx;
    private double ry;
    private double q;

    public Charge(double rx, double ry, double q){
        this.rx = rx;
        this.ry = ry;
        this.q = q;
    }

    public double potentialAt(double x, double y){
        double k = 8.99e09;
        double dx = x - rx;
        double dy = y - ry;
        return k * q / Math.sqrt(dx*dx + dy*dy);
    }

}
