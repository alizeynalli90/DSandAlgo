package az.alizeynalli.leetcodeproblems;

import az.alizeynalli.dt.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
public class LL_SwapNodes {
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next == null){
            return head;
        }
        List<Integer> temp = new ArrayList<>();
        ListNode result = null;
        ListNode t = new ListNode();
        result = t;
        while(head != null){
            temp.add(head.val);
            head = head.next;
        }
        Integer a = temp.get(k-1);
        Integer size = temp.size();
        temp.set(k-1, temp.get(size-k));
        temp.set((size-k), a);

        for(Integer el: temp){
            t.next = new ListNode(el);
            t = t.next;
        }
        return result.next;
    }
}
