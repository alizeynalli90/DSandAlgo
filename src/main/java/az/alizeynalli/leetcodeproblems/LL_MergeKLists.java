package az.alizeynalli.leetcodeproblems;

import az.alizeynalli.dt.linkedlist.ListNode;

import java.util.PriorityQueue;

// https://leetcode.com/problems/merge-k-sorted-lists/
public class LL_MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(ListNode list : lists){
            while(list != null){
                heap.add(list.val);
                list = list.next;
            }
        }
        ListNode temp = new ListNode();
        ListNode result = temp;
        if(heap.size() == 0){
            return null;
        }
        while(heap.size() != 0){
            temp.next = new ListNode(heap.poll());
            temp = temp.next;
        }
        return result.next;
    }
}
