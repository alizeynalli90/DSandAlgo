package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/move-zeroes/submissions/
public class TP_MoveZeros {
    public void moveZeroes(int[] nums) {
        int start = 0;
        int counter = 0;
        while(counter < nums.length){
            if(nums[counter] != 0){
                int temp = nums[counter];
                nums[counter] = 0;
                nums[start] = temp;
                counter++;
                start++;
            } else{
                counter++;
            }
        }
    }
}
