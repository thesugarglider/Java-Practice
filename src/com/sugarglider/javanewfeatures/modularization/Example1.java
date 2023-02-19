package com.sugarglider.javanewfeatures.modularization;

import java.util.List;

public class Example1 {
    public List<String> sort(List<String> names){
        BubbleSort bubbleSort = new BubbleSort();
        return bubbleSort.sort(names);
    }
}
