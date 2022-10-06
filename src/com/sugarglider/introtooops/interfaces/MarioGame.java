package com.sugarglider.introtooops.interfaces;

public class MarioGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Goes Up");
    }

    @Override
    public void down() {
        System.out.println("Goes Down");
    }

    @Override
    public void right() {
        System.out.println("Goes Forward");
    }

    @Override
    public void left() {
    }
}
