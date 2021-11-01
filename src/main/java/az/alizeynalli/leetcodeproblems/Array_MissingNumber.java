package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/missing-number/
public class Array_MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        int max = nums.length;
        while(max > 0){
            sum -= max;
            max = max-1;
        }
        return sum*(-1);
    }
}
