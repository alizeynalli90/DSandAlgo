package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/merge-sorted-array/
public class Array_MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        int i = 0;
        int mi = 0;
        int ni = 0;
        while(i < m+n){
            if(mi == m && ni != n){
                temp[i] = nums2[ni];
                i++;
                ni++;
            } else if(mi != m && ni == n){
                temp[i] = nums1[mi];
                i++;
                mi++;
            }
            else{
            if(nums1[mi] > nums2[ni]){
                temp[i] = nums2[ni];
                i++;
                ni++;
            } else {
                temp[i] = nums1[mi];
                i++;
                mi++;
            }
            }
        }
        i = 0;
        while(i < m + n){
            nums1[i] = temp[i];
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.println(nums1);
    }
}
