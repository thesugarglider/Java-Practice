package com.sugarglider.datatypes.boxing.challenge;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){

    public Customer(String name, double initialDeposit){
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }

}

public class Challenge1 {
    public static void main(String[] args) {

    }
}
