package com.sugarglider.book;

public class Book {
    private int noOfCopies;

    public void setNoOfCopies(int noOfCopies){
        this.noOfCopies = noOfCopies;
    }

    public int getNoOfCopies(){
        return this.noOfCopies;
    }

    public void openBook(){
        System.out.println("Book Opened");
    }
}
