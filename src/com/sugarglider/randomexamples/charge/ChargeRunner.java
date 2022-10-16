package com.sugarglider.randomexamples.charge;

import com.sugarglider.randomexamples.charge.Charge;

public class ChargeRunner {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        Charge c1 = new Charge(0.51,0.63,21.3);
        Charge c2 = new Charge(0.13,0.94,81.9);

        double v1 = c1.potentialAt(x,y);
        double v2 = c2.potentialAt(x,y);

        System.out.println("%.2e\n"+(v1+v2));
    }
}
