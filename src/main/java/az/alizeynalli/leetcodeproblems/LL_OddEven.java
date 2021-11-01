package az.alizeynalli.leetcodeproblems;

import az.alizeynalli.dt.linkedlist.ListNode;

// https://leetcode.com/problems/odd-even-linked-list/
public class LL_OddEven {
    public ListNode oddEvenList(ListNode head) {
        ListNode result = new ListNode();
        ListNode answer = result;
        ListNode odds = head;
        ListNode evens = head;
        int odd = 1;
        while(odds != null){
            if(odd % 2 == 1){
                result.next = new ListNode(odds.val);
                result = result.next;
            }
            odds = odds.next;
            odd++;
        }
        int even = 1;
        while(evens != null){
            if(even % 2 == 0){
                result.next = new ListNode(evens.val);
                result = result.next;
            }
            evens = evens.next;
            even++;
        }
        return answer.next;
    }
}
