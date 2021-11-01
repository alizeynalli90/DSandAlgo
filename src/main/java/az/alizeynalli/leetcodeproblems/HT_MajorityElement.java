package az.alizeynalli.leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/majority-element/
public class HT_MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer result = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int temp = map.get(nums[i]);
                temp ++;
                map.put(nums[i], temp);
            } else{
                map.put(nums[i], 1);
            }
        }
        for(Integer key : map.keySet()){
            if(map.get(key) > nums.length/2){
                result = key;
                break;
            }
        }
        return result;
    }
}
