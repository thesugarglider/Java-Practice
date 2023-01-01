package com.sugarglider.filesanddirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Example4 {
    public static void main(String[] args) throws IOException {
        Path pathToFile = Paths.get("./resources/data.txt");
//        List<String> allLines = Files.readAllLines(pathToFile);
//        System.out.println(allLines);


        //efficient when file content in large
        Files.lines(pathToFile).map(String::toLowerCase).forEach(System.out::println);
    }
}
