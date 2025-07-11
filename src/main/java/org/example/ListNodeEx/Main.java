package org.example.ListNodeEx;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 298, 3, 88, 5, 6, 7, 8, 9};
        ListNode head = ListNode.makeLinkedListFromTab(nums);
        ListNode num1 = ListNode.makeLinkedListFromTab(new int[]{9,9});
        ListNode num2 = ListNode.makeLinkedListFromTab(new int[]{9, 9, 9, 9});
//        ListNode.printList(head);
        ListNode.addNumbers(num1, num2);
    }
}
