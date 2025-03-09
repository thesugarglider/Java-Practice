package com.sugarglider.exceptionhandling.practice2;

import java.io.FileNotFoundException;

public class ExceptionHandling {

    public static void main(String[] args) {
        share();
    }

    public static void share(){
        try {
            HttpConnect.send(0,"hello","https://www.goodsnips.com");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
