package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/move-zeroes/
public class Array_MoveZeros {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int i = 0;
        int counter = 0;
        while(i<nums.length){
            if(nums[i] == 0){
                counter++;
                break;
            }
            i++;
        }

        int j = i+1;
        while(j < nums.length){
            if(nums[j] == 0){
                j++;
                counter++;
            } else {
                nums[i] = nums[j];
                i++;
                j++;
            }
        }
        int u = nums.length -1;
        while(counter != 0){
            nums[u] = 0;
            u--;
            counter--;
        }
    }
}
