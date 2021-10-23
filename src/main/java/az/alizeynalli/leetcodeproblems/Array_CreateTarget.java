package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/create-target-array-in-the-given-order/
public class Array_CreateTarget {
    public int[] createTargetArray(int[] nums, int[] index) {
        int res[] = new int[index.length];

        for (int i = 0; i < index.length; i++) {
            res[i] = -1;
        }

        for (int i = 0; i < index.length; i++) {
            if (res[index[i]] == -1) {
                res[index[i]] = nums[i];
            } else {
                res = shift(res, index[i]);
                res[index[i]] = nums[i];
            }

        }
        return res;
    }

    private int[] shift(int[] array, int index) {
        for (int i = array.length - 1; index < i; i--) {
            array[i] = array[i - 1];
        }
        return array;
    }
}
