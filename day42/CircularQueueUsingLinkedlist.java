/**
Day 42 – Circular & Linked Queue
Concept: Circular queue, queue using linked list.
Problem: Circular Queue Implementation – GFG
Goal: Handle overflow efficiently.
 */

public class CircularQueueUsingLinkedlist {
    static int size = 0;
    static Node head;
    static Node tail;           // Added tail pointer
    static int capacity = 5;

    public static class Node {
        int data;
        Node next;
        
        Node(int data) { 
            this.data = data;
            this.next = null;
        }
    }
    
    public static void Enqueue(int n) {
        Node newnode = new Node(n);

        if (size == capacity) {
            System.out.println("Overflow");
            return;
        }

        if (head == null) {
            head = newnode;
            tail = newnode;
            tail.next = head;        
        } 
        else {
            tail.next = newnode;      
            tail = newnode;           
            tail.next = head;         
        }

        size++;
    }
    
    public static void Dequeue() {
        if (size == 0) {
            System.out.println("Underflow");
            return;
        }
        
        if (size == 1) {
            head = null;
            tail = null;
        } 
        else {
            head = head.next;        // Move head forward
            tail.next = head;        // Update circular link
        }

        size--;
    }
    
    public static boolean IsEmpty() {
        return size == 0;
    }
    
    public static int Size() {
        return size;
    }
    
    public static void Peek() {
        if (size == 0) 
            System.out.println("Empty Queue");
        else 
            System.out.println("Peek: " + head.data);
    }

    public static void display() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }
        
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Enqueue:");
        Enqueue(5);
        Enqueue(4);
        Enqueue(3);
        Enqueue(2);
        Enqueue(1);
        Enqueue(66);        // This should show Overflow

        System.out.println("Display:");
        display();

        System.out.println("Dequeue:");
        Dequeue();
        Dequeue();
        Dequeue();
        Dequeue();

        System.out.println("Display:");
        display();
       
        System.out.println("Enqueue:");
        Enqueue(6);

        System.out.println("Display:");
        display();
        
        System.out.println("\nisEmpty: " + IsEmpty());
        System.out.println("size: " + Size());

        Peek();
    }
}






/*
Day 42 – Circular & Linked Queue
Concept: Circular queue, queue using linked list.
Problem: Circular Queue Implementation – GFG
Goal: Handle overflow efficiently.
 

public class CircularQueueUsingLinkedlist {
    static int size=0;
    static Node head;
    static Node tail;
    static int capacity=5;

    public static class Node{
        int data;
        Node next;
        // Node pre;
        Node(int data){ 
            this.data=data;
            this.next=null;
            // this.pre=null;       
        }
    }
    
    public static Node Enqueue(int n){
        Node newnode = new Node(n);

        if(size == capacity ){System.out.println("Overflow");return head;}

        if(head == null && tail == null){head = newnode;tail = newnode;}
        else{ 
        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }temp.next=newnode;
        tail=temp.next;
        // tail.next=head;
    }

        size++;
        return head;
    }
    
    public static Node Dequeue(){
        if(size == 0 ){System.out.println("Underflow");return head;}
        
        head = head.next;

        size--;
        return head;
    }
    
    public static boolean IsEmpty(){
        if(size == 0)return true;
        else return false;
    }
    
    public static int Size(){
        return size;
    }
    
    public static void Peek(){
        if(size==0)System.out.println("Empty Queue");
        else {System.out.println("Peek: "+ head.data);}
        
    }

    public static void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Enqueue:");
        Enqueue(5);
        Enqueue(4);
        Enqueue(3);
        Enqueue(2);
        Enqueue(1);
        Enqueue(66);

        System.out.println("Display:");
        display();

        System.out.println("Dequeue:");
        Dequeue();
        Dequeue();
        Dequeue();
        Dequeue();

        System.out.println("Display:");
        display();
       
        System.out.println("Enqueue:");
        Enqueue(6);

        System.out.println("Display:");
        display();
        
        System.out.println("\nisEmpty: "+IsEmpty());
        System.out.println("size: "+Size());

        Peek();

    }
}

 */