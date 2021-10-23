package az.alizeynalli.leetcodeproblems;


import az.alizeynalli.dt.linkedlist.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// https://leetcode.com/problems/merge-two-sorted-lists/
public class LL_MergeTwoLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        return merge(l1, l2, result);
    }

    private static ListNode merge(ListNode l1, ListNode l2, ListNode result) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            result = l1;
            result.next = merge(l1.next, l2, result);
        } else {
            result = l2;
            result.next = merge(l1, l2.next, result);
        }

        return result;
    }

    public static void main(String[] args) {
        mergeTwoLists(new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(2, new ListNode(3, new ListNode(6)))
        );
    }
}