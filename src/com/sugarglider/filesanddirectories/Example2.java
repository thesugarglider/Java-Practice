package com.sugarglider.filesanddirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {
    public static void main(String[] args) throws IOException {
        Path start = Paths.get(".");
        Files.walk(start,3).forEach(System.out::println);
    }
}
