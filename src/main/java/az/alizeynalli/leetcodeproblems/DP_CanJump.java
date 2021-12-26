package az.alizeynalli.leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

public class DP_CanJump {
    public static boolean canJump(int[] nums) {
        Map<Integer, Boolean> memo = new HashMap<>();
        memo.put(nums.length -1, true);
        return jump(nums, 0, new HashMap<>());
    }

    private static boolean jump(int[] nums, int position, Map<Integer, Boolean> memo){
        if(memo.containsKey(position)){
            return memo.get(position);
        }
        if (position == nums.length -1){
            return true;
        }
        for(int i = position+nums[position]; i > position; i--){
            if(i < nums.length){
                if(jump(nums, i, memo)){
                    memo.put(i, true);
                    return memo.get(i);
                };
            }
        }
        memo.put(position, false);
        return memo.get(position);
    }


    public static void main(String[] args) {
        int[] t = {2,3,1,1,4}; //true
        int[] f = {3,2,1,0,4}; // false
        int[] zero = {0,1}; // false
        int[] one = {0}; // true
        int[] two = {1}; // true
        int[] secondzero = {2,0};//true
        int[] secondzerozero = {2,0,0};//true


        System.out.println(canJump(t));
        System.out.println(canJump(f));
        System.out.println(canJump(zero));
        System.out.println(canJump(one));
        System.out.println(canJump(two));
        System.out.println(canJump(secondzero));
        System.out.println(canJump(secondzerozero));
    }
}
