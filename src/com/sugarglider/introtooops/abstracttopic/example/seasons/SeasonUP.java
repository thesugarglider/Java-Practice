package com.sugarglider.introtooops.abstracttopic.example.seasons;

import com.sugarglider.introtooops.abstracttopic.example.Season;

public class SeasonUP implements Season {

    @Override
    public String winter() {
        return "Extreme";
    }

    @Override
    public String rainy() {
        return "Low";
    }

    @Override
    public String summer() {
        return "Moderate";
    }
}
