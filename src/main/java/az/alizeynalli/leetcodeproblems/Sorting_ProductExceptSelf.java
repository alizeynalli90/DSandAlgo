package az.alizeynalli.leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/product-of-array-except-self/
public class Sorting_ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        Map<Integer, Integer[]> prod = new HashMap<>();
        Integer[] first = {1, 1};
        prod.put(0, first);
        int left = 1;
        for(int i=1;i<nums.length;i++){
            left = left*nums[i-1];
            Integer[] tempL = {left, 1};
            prod.put(i, tempL);
        }
        int right =1;
        for(int j=nums.length-2; j>=0;j--){
            right = right * nums[j+1];
            Integer[] tempR = prod.get(j);
            tempR[1] = right;
            prod.put(j, tempR);
        }
        int[] result = new int[nums.length];
        for(int u = 0; u<result.length;u++){
            Integer[] tempResult = prod.get(u);
            result[u] = tempResult[0]*tempResult[1];
        }
        return result;
    }
}
