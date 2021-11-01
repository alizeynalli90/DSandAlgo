package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class Array_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int counter = 0;
        while (j < nums.length){
            if(nums[i] == nums[j]){
                j++;
                counter++;
            } else{
                nums[i+1] = nums[j];
                i++;
                j++;
            }
        }
        while(i +1<nums.length){
            nums[i+1] = 0;
            i++;
        }
        return nums.length - counter;
    }
}
