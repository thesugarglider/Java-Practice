package com.sugarglider.loops.whileloop;

public class SquareAndCube {
    private int number;

    SquareAndCube(int number){
        this.number = number;
    }

    void squareUptoLimit(){
        int i=1;
        while (i*i < number){
            System.out.print(i*i+" ");
            i++;
        }
        System.out.println();
    }

    void cubeUptoLimit(){
        int i=1;
        while (i*i*i < number){
            System.out.print(i*i*i+" ");
            i++;
        }
        System.out.println();
    }
}
