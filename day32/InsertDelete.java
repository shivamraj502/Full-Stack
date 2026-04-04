// Day 32 – Insertion & Deletion
// Concept: Insert at beginning, end, and specific position; delete by key/index.
// Problem: Insert/Delete in Linked List – GFG
// Goal: Learn pointer manipulation.

// package day32;
public class InsertDelete {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    Node head;
    public static Node insertAtFront(Node head,int a){
        System.out.println("insertAtFront:");
        Node newNode = new Node(a);
        newNode.next = head;
        head = newNode;

        return head;
    }

    public static Node insertAtEnd(Node head,int a){
        System.out.println("insertAtEnd:");
        Node newNode = new Node(a);

        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }temp.next=newNode;

        return head;
    }

    public static Node deleteAtFront(Node head){
        System.out.println("deleteAtFront:");
        Node temp = head.next;

        return temp;
    }

    public static Node deleteAtEnd(Node head){
        System.out.println("deleteAtEnd:");
        Node temp = head;
        Node temp2 = head;
        while(temp.next != null){
            temp2= temp;
            temp=temp.next;
        }temp2.next= null;
        temp = null;

        return head;
    }

    public static Node insertAtIndex(Node head,int a, int position){
        int count = 1;
        System.out.println("insertAtIndex:");
        Node newNode = new Node(a);
        Node temp = head;
        while(count != (position-1)){
            temp=temp.next;
            count++;
            // System.out.println(".");
        }newNode.next=temp.next;
        temp.next=newNode;

        return head;
    }

    public static Node insertAfterKey(Node head,int a,int key){
        System.out.println("insertAfterKey:");
        Node newNode = new Node(a);
        Node temp = head;
        while(temp.data != key){
            temp=temp.next;
            // System.out.println(".");
        }newNode.next=temp.next;
        temp.next=newNode;

        return head;
    }

    public static void main(String[] args) {
        InsertDelete list = new InsertDelete();
        Node head = new Node(1);
        Node second = new Node(11);
        Node tail = new Node(13);
        
        head.next=second;
        head.next.next=tail;

        System.out.print("Original Linkedlist: \n");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }System.out.println();temp=head;

        Node head2 = insertAtFront(head,12);
        Node temp2 = head2;
        while(temp2 != null){
            System.out.print(temp2.data+" ");
            temp2=temp2.next;
        }System.out.println();

        Node head3 =insertAtEnd(head,17);
        Node temp3 = head3;
        while(temp3 != null){
            System.out.print(temp3.data+" ");
            temp3=temp3.next;
        }System.out.println();

        Node head4 =deleteAtFront(head);
        Node temp4 = head4;
        while(temp4 != null){
            System.out.print(temp4.data+" ");
            temp4=temp4.next;
        }System.out.println();

        Node head5 =deleteAtEnd(head);
        Node temp5 = head5;
        while(temp5 != null){
            System.out.print(temp5.data+" ");
            temp5=temp5.next;
        }System.out.println();

        int position = 3;
        Node head6 =insertAtIndex(head,10,position);
        Node temp6 = head6;
        while(temp6 != null){
            System.out.print(temp6.data+" ");
            temp6=temp6.next;
        }System.out.println();

        Node head7 =insertAfterKey(head,111,11);
        Node temp7 = head7;
        while(temp7 != null){
            System.out.print(temp7.data+" ");
            temp7=temp7.next;
        }System.out.println();

        
    }
}
