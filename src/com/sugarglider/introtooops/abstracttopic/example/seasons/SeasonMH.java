package com.sugarglider.introtooops.abstracttopic.example.seasons;

import com.sugarglider.introtooops.abstracttopic.example.Season;

public class SeasonMH implements Season {
    @Override
    public String winter() {
        return "Low";
    }

    @Override
    public String rainy() {
        return "Extreme";
    }

    @Override
    public String summer() {
        return "High";
    }
}
