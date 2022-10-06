package com.sugarglider.introtooops.interfaces;

public class ContraGame implements GamingConsole{
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
        System.out.println("Goes Right");
    }

    @Override
    public void left() {
        System.out.println("Goes Left");
    }

    public void fire(){
        System.out.println("Fire");
    }
}
