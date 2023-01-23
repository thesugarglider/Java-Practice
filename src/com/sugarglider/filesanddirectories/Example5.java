package com.sugarglider.filesanddirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Example5 {
    public static void main(String[] args) throws IOException {
        Path pathToWriteFile = Paths.get("./resources/filetowrite.txt");

        List<String> list = List.of("Apple", "Cat", "Dog","Mango");
        Files.write(pathToWriteFile,list);
    }
}
