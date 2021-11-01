package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/sort-an-array/
public class Sort_MergeSort {
    public int[] sortArray(int[] nums) {
        return sort(nums, nums.length);
    }

    private int[] sort(int[] nums, int length){
        if(length < 2){
            return nums;
        }
        int mid = length/2;
        int[] head = new int[mid];
        int[] tail = new int[length-mid];
        for(int i=0;i<mid;i++){
            head[i] = nums[i];
        }
        for(int i=mid;i<length;i++){
            tail[i-mid] = nums[i];
        }
        sort(head, head.length);
        sort(tail, tail.length);

        return merge(nums, head, tail, mid, length-mid);
    }

    private int[] merge(int[] array, int[] head, int[] tail, int low, int high){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<low && j<high){
            if(head[i]<=tail[j]){
                array[k++] = head[i++];
            } else{
                array[k++] = tail[j++];
            }
        }
        while(i<low){
            array[k++] = head[i++];
        }
        while(j<high){
            array[k++] = tail[j++];
        }
        return array;
    }
}
