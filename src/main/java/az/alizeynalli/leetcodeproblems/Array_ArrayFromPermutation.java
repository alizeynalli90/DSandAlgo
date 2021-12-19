package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/build-array-from-permutation/
public class
Array_ArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int test[] = {0, 2, 1, 5, 3, 4};
        buildArray(test);
    }
}
