package com.sugarglider.introtooops.abstracttopic.example;

import com.sugarglider.introtooops.abstracttopic.example.seasons.SeasonMH;
import com.sugarglider.introtooops.abstracttopic.example.seasons.SeasonUP;
import com.sugarglider.introtooops.abstracttopic.example.states.Maharashtra;
import com.sugarglider.introtooops.abstracttopic.example.states.UttarPradesh;

public class Main {
    public static void main(String[] args) {
        Maharashtra maharashtra = new Maharashtra();
        SeasonMH seasonMH = new SeasonMH();
        System.out.println(maharashtra);
        System.out.println("Rain in Maharashtra "+seasonMH.rainy());

        System.out.println();

        UttarPradesh uttarPradesh = new UttarPradesh();
        SeasonUP seasonUP = new SeasonUP();
        System.out.println(uttarPradesh);
        System.out.println("Rain in UP "+seasonUP.rainy());
    }
}
