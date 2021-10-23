package az.alizeynalli.leetcodeproblems;


import az.alizeynalli.dt.linkedlist.ListNode;

// https://leetcode.com/problems/remove-linked-list-elements/
public class LL_RemoveLLElement {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyNode = new ListNode(0, head);
        ListNode previousNode = dummyNode;

        // Logic: Previous node will not move if head's val matches with the given value
        while (head != null) {
            if (head.val == val) {
                head = head.next;
                previousNode.next = head;
            } else {
                previousNode = previousNode.next;
                head = head.next;
            }

        }

        return dummyNode.next;
    }
}
