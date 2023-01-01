package com.sugarglider.filesanddirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * simple directory scanner
 */
public class Example1 {
    public static void main(String[] args) throws IOException {
        Files.list(Paths.get(".")).forEach(System.out::println);
    }
}
