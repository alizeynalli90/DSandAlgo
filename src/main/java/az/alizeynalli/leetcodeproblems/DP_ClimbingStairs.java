package az.alizeynalli.leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/climbing-stairs/
public class DP_ClimbingStairs {

    public static int climbStairs(int n) {
        return climbMemo(n, new HashMap<>());
    }

    private static int climbMemo(int n, Map<Integer, Integer> memo){
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        if(n == 0){
            memo.put(n, 1);
            return memo.get(n);
        }
        if(n < 0){
            return 0;
        }

        memo.put(n, climbMemo(n-1, memo)+climbMemo(n-2, memo));
        return memo.get(n);
    }

    public static void main(String[] args) {
        int res = climbStairs(4);
        System.out.println(res);
    }
}
