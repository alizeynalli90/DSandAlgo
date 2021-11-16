package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/squares-of-a-sorted-array/
public class TP_SortSquares {

    public static int[] sortedSquares(int[] nums) {
        int[] temp = new int[(nums.length)];
        int start = 0;
        int end = nums.length - 1;
        int tempEnd = end;
        while(start <= end){
            if(Math.abs(nums[start]) <= Math.abs(nums[end])){
                temp[tempEnd] = nums[end];
                end--;
            } else {
                temp[tempEnd] = nums[start];
                start++;
            }
            tempEnd--;
        }
        for(int i = 0; i < temp.length; i++){
            temp[i] = temp[i] * temp[i];
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] temp = {-4,-1,0,3,10};
        sortedSquares(temp);
    }
}
