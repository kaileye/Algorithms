package LeetCode.ReverseLinkedList;

// Reverse a singly linked list.

// Iterative solution
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode temp;
        while (head != null) {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}

// Recursive solution
public class Solution {
    public ListNode reverseList(ListNode head) {
        return reverseListRecurs(head, null);
    }
    
    public ListNode reverseListRecurs(ListNode head, ListNode prev) {
        if (head == null) {
            return prev;
        }
        ListNode temp = head.next;
        head.next = prev;
        return reverseListRecurs(temp, head);
    }
}