/**
Day 44 – Deque & Priority Queue
Concept: Double-ended queue (ArrayDeque), intro to PriorityQueue (heap-based).
Problem: Priority Queue in Java – GFG
Goal: Use built-in Java utilities.
 */

import java.util.*;
// import java.util.ArrayDeque;
// import java.util.Deque;
public class Dequee {
    public static void main(String[] args) {
        
        // Correct way to create a Deque
        Deque<Integer> dq = new ArrayDeque<>();

        // Adding elements
        dq.addLast(10);
        dq.addLast(20);
        dq.addFirst(5);
        dq.addFirst(1);

        System.out.println("Deque: " + dq);
        
        // Removing elements
        System.out.println("Removed from front: " + dq.removeFirst());
        System.out.println("Removed from back: " + dq.removeLast());
        
        System.out.println("Deque after removal: " + dq);
    }
}