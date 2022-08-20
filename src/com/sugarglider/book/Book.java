package com.sugarglider.book;

public class Book {
    private short noOfCopies;

    public void setNoOfCopies(short noOfCopies){
        this.noOfCopies = noOfCopies;
    }

    public short getNoOfCopies(){
        return this.noOfCopies;
    }

    public void increaseCopies(short howMuch){
        this.noOfCopies += howMuch;
    }

    public void decreaseCopies(short howMuch){
        this.noOfCopies -= howMuch;
    }

    public void openBook(){
        System.out.println("Book Opened");
    }
}
