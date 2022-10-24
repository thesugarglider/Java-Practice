package com.sugarglider.collections.queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample2Runner {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(new QueueExample2());
        queue.addAll(List.of("Apple","Cat","Zebra","Monkey"));
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
