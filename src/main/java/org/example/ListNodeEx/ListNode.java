package org.example.ListNodeEx;

// Linked List implementation
public class ListNode {
    int val;
    ListNode next;

    ListNode(){}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // static method to print LinkedList
    public static void printList(ListNode head) {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.val + ", ");
            current = current.next;
        }
    }
}
