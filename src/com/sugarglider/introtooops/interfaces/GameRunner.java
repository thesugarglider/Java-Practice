package com.sugarglider.introtooops.interfaces;

public class GameRunner {
    public static void main(String[] args) {
        MarioGame marioGame = new MarioGame();
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();

        System.out.println();
        System.out.println("Contra Game");
        ContraGame contraGame = new ContraGame();
        contraGame.up();
        contraGame.down();
        contraGame.right();
        contraGame.left();
        contraGame.fire();

        System.out.println();
        System.out.println("Chess Game");
        GamingConsole chessGame = new ChessGame();
        chessGame.left();
        chessGame.right();
        chessGame.up();
        chessGame.down();
    }
}
