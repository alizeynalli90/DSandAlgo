package az.alizeynalli.leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/house-robber-ii/
public class DP_HouseRobber2 {
    public static int rob(int[] nums) {
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            int temp = bf(nums, i, new HashMap<>());
            total = Math.max(total, temp);
        }
        return  total;
    }

    private static int bf(int[] nums, int index, Map<Integer, Integer> memo){
        if(memo.containsKey(index)){
            return memo.get(index);
        }
        if(index >= nums.length){
            return 0;
        }
        int temp = nums[index];
        memo.put(index, temp);
        for(int j = index +2; j< nums.length; j++){
            if(memo.containsKey(0) && j == nums.length - 1){
                continue;
            }
            temp = Math.max(temp, nums[index] +bf(nums, j, memo));
        }
        memo.put(index, temp);
        return memo.get(index);
    }

    public static void main(String[] args) {
        int[] nums = {2,3,2};
        System.out.println(rob(nums));
    }
}
