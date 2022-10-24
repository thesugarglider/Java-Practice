package com.sugarglider.collections.queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample1 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        System.out.println(queue.poll());

        queue.offer("Apple");
        System.out.println(queue);

        queue.addAll(List.of("Cat","Zebra","Monkey"));
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);




    }
}
