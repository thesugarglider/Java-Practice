package com.sugarglider.introtooops.interfaces.complexaglo;

public class DummyAlgorithm implements ComplexAglorithm {
    @Override
    public void add(int numberOne, int numberTwo) {
        System.out.println("Addition is "+(numberOne+numberTwo));
    }

}
