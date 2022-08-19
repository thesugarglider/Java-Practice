package com.sugarglider.book;

public class Book {
    private short noOfCopies;

    public void setNoOfCopies(short noOfCopies){
        this.noOfCopies = noOfCopies;
    }

    public short getNoOfCopies(){
        return this.noOfCopies;
    }

    public void openBook(){
        System.out.println("Book Opened");
    }
}
