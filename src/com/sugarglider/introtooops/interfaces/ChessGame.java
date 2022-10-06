package com.sugarglider.introtooops.interfaces;

public class ChessGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("Piece Forward");
    }

    @Override
    public void down() {
        System.out.println("Piece Backward");
    }

    @Override
    public void right() {
        System.out.println("Piece Right");
    }

    @Override
    public void left() {
        System.out.println("Piece Left");
    }

    public void diagonal(){
        System.out.println("Piece Diagonal");
    }
}
