/** 
83. Remove Duplicates from Sorted List
 */

import java.util.*;
public class leetcode83 {

    // Definition of ListNode
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode node = head;

        while (node != null && node.next != null) {

            if (node.val == node.next.val) {
                node.next = node.next.next; // skip duplicate
            } else {
                node = node.next;
            }
        }

        return head;
    }

    // Helper to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create list: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.print("Before: ");
        printList(head);

        head = deleteDuplicates(head);

        System.out.print("After: ");
        printList(head);
    }
}