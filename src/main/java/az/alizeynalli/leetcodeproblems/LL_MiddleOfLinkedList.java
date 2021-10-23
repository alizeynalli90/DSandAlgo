package az.alizeynalli.leetcodeproblems;


import az.alizeynalli.dt.linkedlist.ListNode;

// https://leetcode.com/problems/middle-of-the-linked-list/
public class LL_MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode[] A = new ListNode[100];
        int t = 0;
        while (head != null) {
            A[t++] = head;
            head = head.next;
        }
        return A[t / 2];
    }
}