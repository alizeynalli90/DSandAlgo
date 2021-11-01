package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class Array_FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int notFound[] = {-1,-1};
        if(nums.length == 0){
            return notFound;
        }
        if(nums.length == 1){
            int[] zero = {0,0};
            return nums[0] == target ? zero : notFound;
        }

        int low = 0;
        int high = nums.length-1;
        int found = 0;

        while(low<=high){
            int mid = (low +high)/2;
            if(nums[mid] == target){
                return borders(nums, mid);
            } else if(nums[mid] < target){
                low = mid +1;
            } else {
                high = mid -1;
            }
        }
        return notFound;
    }

    private int[] borders(int[] nums, int mid){
        int result[] = new int[2];
        int target = nums[mid];

        while(mid != -1 && nums[mid] == target){
            mid--;
        }
        mid++;
        result[0] = mid;
        while(mid != nums.length && nums[mid] == target){
            mid++;
        }

        mid--;

        result[1] = mid;
        return result;
    }
}
