package com.sugarglider.introtooops.abstracttopic.recipe;

public class Recipe1 extends Recipe {

    @Override
    public void getReady() {
        System.out.println("Recipe 1 material");
    }

    @Override
    public void doTheDish() {
        System.out.println("Recipe 1 cooking");
    }

    @Override
    public void cleanUp() {
        System.out.println("Cleanup after Recipe 1");
    }
}
