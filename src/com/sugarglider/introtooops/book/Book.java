package com.sugarglider.introtooops.book;

public class Book {
    private short noOfCopies;

    Book(short noOfCopies){
        this.noOfCopies = setNoOfCopies(noOfCopies);
    }

    public short setNoOfCopies(short noOfCopies){
        this.noOfCopies = noOfCopies;
        return this.noOfCopies;
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
