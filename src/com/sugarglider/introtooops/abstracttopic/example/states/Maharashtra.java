package com.sugarglider.introtooops.abstracttopic.example.states;

import com.sugarglider.introtooops.abstracttopic.example.State;

public class Maharashtra extends State {
    @Override
    public String language() {
        return "Marathi";
    }

    @Override
    public int population() {
        return 12;
    }

    @Override
    public String stateCapital() {
        return "Mumbai";
    }


}
