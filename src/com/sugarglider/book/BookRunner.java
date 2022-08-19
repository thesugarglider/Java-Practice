package com.sugarglider.book;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book();

        artOfComputerProgramming.setNoOfCopies((short)5);
        System.out.println(artOfComputerProgramming.getNoOfCopies());
        artOfComputerProgramming.openBook();
    }
}
