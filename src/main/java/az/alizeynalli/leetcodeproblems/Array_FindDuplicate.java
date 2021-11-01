package az.alizeynalli.leetcodeproblems;

import java.util.Arrays;

// https://leetcode.com/problems/find-the-duplicate-number/
public class Array_FindDuplicate {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int i=0; i+1<nums.length;i++){
            if(nums[i]==nums[i+1]){
                result = nums[i];
            }
        }
        return result;
    }
}
