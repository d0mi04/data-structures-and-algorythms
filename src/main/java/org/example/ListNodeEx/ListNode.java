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
        while(head != null) {
            System.out.print(head.val + ", ");
            head = head.next;
        }
    }

    // static method to create LinkedList from tab
    public static ListNode makeLinkedListFromTab(int[] nums) {
        ListNode head = new ListNode(nums[0]);
        ListNode tail = head;

        for(int i = 1; i < nums.length; i++) {
            tail.next = new ListNode(nums[i]);
            tail = tail.next;
        }

        return head;
    }

    // static method to add two numbers saved in two LinkedLists:
    public static void addNumbers(ListNode head1, ListNode head2) {
        ListNode output = new ListNode();
        ListNode tail = output;
        int carry = 0;
        while(head1 != null || head2 != null) {
            int val1 = head1 != null ? head1.val : 0;
            int val2 = head2 != null ? head2.val : 0;

            int sum = val1 + val2 + carry;
            tail.next = new ListNode(sum % 10);
            carry = sum / 10;

            tail = tail.next;
            if(head1 != null) head1 = head1.next;
            if(head2 != null) head2 = head2.next;
        }

        if(carry != 0) {
            tail.next = new ListNode(carry);
        }
        printList(output.next);
    }
}
