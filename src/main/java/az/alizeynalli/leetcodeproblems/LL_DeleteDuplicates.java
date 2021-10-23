package az.alizeynalli.leetcodeproblems;


import az.alizeynalli.dt.linkedlist.ListNode;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class LL_DeleteDuplicates {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(
                1, new ListNode(
                1, new ListNode(
                2, new ListNode(
                3, new ListNode(
                3)))));
        deleteDuplicates(node);
    }
}
