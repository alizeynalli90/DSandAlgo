package az.alizeynalli.leetcodeproblems;

import java.util.*;

// https://leetcode.com/problems/height-checker/
public class Sorting_HeightChecker {
    public static int heightChecker(int[] heights) {
        List<Integer> expected = new ArrayList<>();
        for(int i=0; i < heights.length;i++){
            expected.add(heights[i]);
        }
        Collections.sort(expected);
        int res = 0;
        for(int i=0; i < heights.length;i++){
            if(heights[i] != expected.get(i)){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
