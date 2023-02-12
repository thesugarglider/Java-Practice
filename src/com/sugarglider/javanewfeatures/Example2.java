/**
 * Files.readString and Files.writeString example added.
 */

package com.sugarglider.javanewfeatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./resources/file1.txt");
        String fileContent = Files.readString(path);
        System.out.println(fileContent);

        String newContent = fileContent.replace("Pravinkumar", "Pravinkumar O.");
        Path newFile = Paths.get("./resources/file2.txt");
        Files.writeString(newFile, newContent);
    }
}
