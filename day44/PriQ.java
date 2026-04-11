/**
Day 44 – Deque & Priority Queue
Concept: Double-ended queue (ArrayDeque), intro to PriorityQueue (heap-based).
Problem: Priority Queue in Java – GFG
Goal: Use built-in Java utilities.
 */

import java.util.PriorityQueue;
// import java.util.*;
public class PriQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(20);
        pq.add(1);
        
        System.out.println("PriorityQueue elements: " + pq);
        
        // Removing elements (always removes smallest element first)
        System.out.println("Removed: " + pq.poll());
        System.out.println("Removed: " + pq.poll());
        
        System.out.println("PriorityQueue after removal: " + pq);
        
        // Peek the smallest element without removing
        System.out.println("Top element (peek): " + pq.peek());
        
        System.out.println("Size of PriorityQueue: " + pq.size());
        
    }
}

/*
Issues in Your Code (Pointwise):

Class Name Conflict (Main Reason for Red Line)
Your class name is public class PriorityQ, but you have imported java.util.*.
Inside java.util.*, there is a class called PriorityQueue.
Java is getting confused between your class name PriorityQ and the built-in PriorityQueue class.
Naming Issue
Your class name PriorityQ is too similar to PriorityQueue. This causes ambiguity (confusion) for the compiler.
Commented Import is Harmless
The line // import java.util.PriorityQueue; is commented, so it's fine.
Code Logic is Correct
The rest of your code (PriorityQueue operations) is actually correct. */