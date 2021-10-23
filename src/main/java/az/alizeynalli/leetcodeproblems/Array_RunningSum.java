package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/running-sum-of-1d-array/
public class Array_RunningSum {
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = temp + nums[i];
            ans[i] = temp;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4};
        runningSum(test);
    }
}
