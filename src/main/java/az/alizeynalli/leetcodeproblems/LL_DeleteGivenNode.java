package az.alizeynalli.leetcodeproblems;


import az.alizeynalli.dt.linkedlist.ListNode;

// https://leetcode.com/problems/delete-node-in-a-linked-list/
public class LL_DeleteGivenNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
