package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/number-of-good-pairs/
public class Array_NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result++;
                }
            }
        }
        return result;
    }
}
