package com.sugarglider.filesanddirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * searching files using filter
 */
public class Example3 {
    public static void main(String[] args) throws IOException {
        Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
        Files.walk(Paths.get("."),4).filter(predicate).forEach(System.out::println);

        BiPredicate<Path, BasicFileAttributes> javaMatcher = ((path, basicFileAttributes) -> String.valueOf(path).contains(".java"));

        BiPredicate<Path, BasicFileAttributes> directoryMatcher = ((path, basicFileAttributes) -> basicFileAttributes.isDirectory());

        Files.find(Paths.get("."),4,javaMatcher).forEach(System.out::println);
    }
}
