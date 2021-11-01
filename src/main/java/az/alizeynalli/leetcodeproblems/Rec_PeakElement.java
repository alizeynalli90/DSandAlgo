package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/find-peak-element/
public class Rec_PeakElement {
    public int findPeakElement(int[] nums) {
        return rec(nums, 0, nums.length-1);
    }

    private int rec(int[] nums, int low, int high){

        if(high==low){
            return low;
        }

        int middle = (low + high)/2;
        if(nums[middle]>nums[middle+1]){
            return rec(nums, low, middle);
        }
        return rec(nums, middle+1, high);
    }
}
