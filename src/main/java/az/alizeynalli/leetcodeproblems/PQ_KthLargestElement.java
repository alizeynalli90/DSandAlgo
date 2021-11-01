package az.alizeynalli.leetcodeproblems;

import java.util.Collections;
import java.util.PriorityQueue;

//https://leetcode.com/problems/kth-largest-element-in-an-array/
public class PQ_KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> list = new PriorityQueue(10000, Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int j=1;j<k;j++){
            list.poll();
        }
        return list.poll();
    }
}
