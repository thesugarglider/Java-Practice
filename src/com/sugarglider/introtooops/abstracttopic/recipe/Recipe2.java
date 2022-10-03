package com.sugarglider.introtooops.abstracttopic.recipe;

public class Recipe2 extends Recipe{

    @Override
    public void getReady() {
        System.out.print("Recipe2 ");
        System.out.println("Material");
    }

    @Override
    public void doTheDish() {
        System.out.print("Recipe2 ");
        System.out.println("Cooking");
    }

    @Override
    public void cleanUp() {
        System.out.println("Cleanup");
    }
}
