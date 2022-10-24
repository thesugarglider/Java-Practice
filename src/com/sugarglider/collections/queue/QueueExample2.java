package com.sugarglider.collections.queue;


import java.util.Comparator;

public class QueueExample2 implements Comparator<String> {

    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value1.length(),value2.length());
    }
}
