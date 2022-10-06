package com.sugarglider.introtooops.interfaces.exercise.flyable;

import com.sugarglider.introtooops.interfaces.exercise.flyable.Flyable;

public class FlyRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};

        for (Flyable flying:flyingObjects){
            flying.fly();
        }
    }
}
