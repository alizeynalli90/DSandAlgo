package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
public class Sorting_MaxProductDifference {

    public static int maxProductDifference(int[] nums) {
        int n, a, b, c, d;
        n = a = b = c = d = 0;
        int temp[] = new int[10000];

        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {

        }
        return (d * c) - (b * a);
    }

    public static void main(String[] args) {
        int test[] = {5, 6, 2, 7, 4};
        System.out.println(maxProductDifference(test));
    }
}
