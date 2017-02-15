package LeetCode.DeleteLinkedListNode;

// Delete a LinkedList node, given only access to that node.

public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}