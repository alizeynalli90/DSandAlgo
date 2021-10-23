package az.alizeynalli.crackingproblems;


import az.alizeynalli.dt.linkedlist.ListNode;

import java.util.Hashtable;

public class Problem2_1 {
    public static void deleteDups(ListNode n) {
        Hashtable table = new Hashtable();
        ListNode previous = null;
        while (n != null) {
            if (table.containsKey(n.val)) previous.next = n.next;
            else {
                table.put(n.val, true);
                previous = n;
            }
            n = n.next;
        }
    }
}
