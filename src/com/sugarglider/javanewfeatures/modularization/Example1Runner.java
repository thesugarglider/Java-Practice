package com.sugarglider.javanewfeatures.modularization;

import java.util.List;
import java.util.logging.Logger;

public class Example1Runner {

    private static Logger logger = Logger.getLogger(Example1.class.getName());
    public static void main(String[] args) {
        Example1 example1 = new Example1();
        List<String> sorted = example1.sort(List.of("Ranga", "Ravi", "Satish", "Adam", "Eve"));
        logger.info(sorted.toString());
    }
}
