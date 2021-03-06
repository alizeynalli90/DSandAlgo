package az.alizeynalli.leetcodeproblems;

import java.util.Arrays;

// https://leetcode.com/problems/design-hashset/
public class HT_CreateHashSet {
    class MyHashSet {
        boolean[] set;

        /**
         * Initialize your data structure here.
         */
        public MyHashSet() {
            set = new boolean[1000001];
            Arrays.fill(set, false);

        }

        public void add(int key) {
            set[key] = true;
        }

        public void remove(int key) {
            set[key] = false;
        }

        /**
         * Returns true if this set contains the specified element
         */
        public boolean contains(int key) {
            return set[key];
        }
    }

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

}
