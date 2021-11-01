package az.alizeynalli.leetcodeproblems;

import az.alizeynalli.dt.linkedlist.ListNode;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class LL_RemoveNthElement {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 1){
            return head.next;
        }

        ListNode counter = head;
        int length = 0;
        while(counter != null){
            length++;
            counter = counter.next;
        }

        int count = 0;
        ListNode original = head;
        ListNode previous = null;
        while(head != null){
            if(length - n == count){
                previous.next = head.next;
                break;
            }
            previous = head;
            head = head.next;
            count++;
        }
        return original;
    }
}
