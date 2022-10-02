package com.sugarglider.introtooops.bookrating;

import java.util.ArrayList;

public class Book {
    private int id;
    private String name;
    private String author;

    ArrayList<Review> reviews = new ArrayList<Review>();

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReviews(Review review){
        this.reviews.add(review);
    }

    public String toString(){
        return String.format("BookId [%d], BookName [%s], BookAuthor [%s], BookReviews %s",id,name,author,reviews);
    }
}
