package com.sugarglider.introtooops.abstracttopic.example.states;

import com.sugarglider.introtooops.abstracttopic.example.State;

public class UttarPradesh extends State {

    @Override
    public String language() {
        return "Hindi";
    }

    @Override
    public int population() {
        return 20;
    }

    @Override
    public String stateCapital() {
        return "Lucknow";
    }
}
