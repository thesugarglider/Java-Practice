package com.sugarglider.introtooops.abstracttopic.example.seasons;

import com.sugarglider.introtooops.abstracttopic.example.Season;

public class SeasonMP implements Season {

    @Override
    public String winter() {
        return "Moderate";
    }

    @Override
    public String rainy() {
        return "Moderate";
    }

    @Override
    public String summer() {
        return "Extreme";
    }
}
