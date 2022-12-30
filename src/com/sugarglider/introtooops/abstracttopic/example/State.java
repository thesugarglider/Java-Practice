package com.sugarglider.introtooops.abstracttopic.example;

public abstract class State {
    public String nationalCapital(){
        return "National Capital: Delhi";
    }
    abstract public String language();

    abstract public int population();

    abstract public String stateCapital();

    public String toString(){
        return "Language Spoken: "+language()+"\n"+"Total Population: "+population()+" crore"+"\n"+"State Capital: "+stateCapital()+"\n"+nationalCapital();
    }
}
