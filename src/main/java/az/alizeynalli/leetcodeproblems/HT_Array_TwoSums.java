package az.alizeynalli.leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
public class HT_Array_TwoSums {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] demo = {3, 1, 3};
        twoSum(demo, 6);
    }
}
