package com.sugarglider.introtooops.bookrating;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book(1,"OOPS","Ranga");
        Review review = new Review(1,"Good Book",5);
        book.addReviews(review);
        //System.out.println(book);
        Review review1 = new Review(2,"Nice",4);
        book.addReviews(review1);
        System.out.println(book);
    }
}
