package az.alizeynalli.leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/single-number/
public class HT_SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Boolean> tracker = new HashMap<>();
        int result = 0;
        for(int i =0;i<nums.length;i++){
            if(tracker.containsKey(nums[i])){
                tracker.put(nums[i], false);
            } else{
                tracker.put(nums[i], true);
            }
        }
        for(Integer key : tracker.keySet()){
            if(tracker.get(key)){
                result = key;
                break;
            }
        }
        return result;
    }
}
