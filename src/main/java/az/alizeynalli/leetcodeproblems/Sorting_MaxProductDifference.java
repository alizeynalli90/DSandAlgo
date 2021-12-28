package az.alizeynalli.leetcodeproblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
public class Sorting_MaxProductDifference {
    public static int maxProductDifference(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(list);
        return list.get(list.size()-1)*list.get(list.size()-2) - list.get(0)*list.get(1);
    }

    public static void main(String[] args) {
        int[] nums = {5,6,2,7,4};
        System.out.println(maxProductDifference(nums));
    }
}
