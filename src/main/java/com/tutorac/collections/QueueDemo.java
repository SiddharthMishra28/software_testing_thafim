package com.tutorac.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> myQueue = new PriorityQueue<>();
        myQueue.add("sid");
        myQueue.add("thafim");
        myQueue.add("shankar");
        myQueue.add("shivam");
        System.out.println(myQueue);
        myQueue.poll();
        System.out.println(myQueue);
    }
}
