package com.sugarglider.introtooops.book;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book((short) 5);

        //artOfComputerProgramming.setNoOfCopies((short)5);
        artOfComputerProgramming.increaseCopies((short)6);
        System.out.println(artOfComputerProgramming.getNoOfCopies());
        System.out.println("Decreasing Number of Copies");
        artOfComputerProgramming.decreaseCopies((short)2);
        System.out.println("Now the copies remaining are "+artOfComputerProgramming.getNoOfCopies());
        artOfComputerProgramming.openBook();
    }
}
