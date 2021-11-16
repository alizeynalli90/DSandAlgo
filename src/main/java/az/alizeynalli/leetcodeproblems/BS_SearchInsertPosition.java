package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/search-insert-position/
public class BS_SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int middle = (start + end) / 2;
            if (nums[middle] < target) {
                start = middle + 1;
            }
            if (nums[middle] > target) {
                end = middle - 1;
            }
            if (nums[middle] == target) {
                return middle;
            }
        }

        if (nums[start] < target) {
            return start + 1;
        } else {
            return start;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 7, 10, 11};
        System.out.println(searchInsert(nums, 6));
    }
}
