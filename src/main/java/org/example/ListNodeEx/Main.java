package org.example.ListNodeEx;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 298, 3, 88, 5, 6, 7, 8, 9};
        ListNode head = new ListNode(nums[0]);
        ListNode tail = head;

        for(int i = 1; i < nums.length; i++) {
            tail.next = new ListNode(nums[i]);
            tail = tail.next;
        }

        ListNode.printList(head);
    }
}
