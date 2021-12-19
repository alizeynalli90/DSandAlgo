package az.alizeynalli.leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/min-cost-climbing-stairs/
public class DP_MinCost {
    public static int minCostClimbingStairs(int[] cost) {
        return Math.min(bf(cost, 0, new HashMap<Integer, Integer>()), bf(cost, 1, new HashMap<Integer, Integer>()));
    }

    private static int bf(int[] cost, int position, Map<Integer, Integer> memo){
        if(memo.containsKey(position)){
            return memo.get(position);
        }
        if(position >= cost.length){
            return 0;
        }
        int temp = cost[position] + Math.min(bf(cost, position +1, memo), bf(cost, position+2, memo));
        memo.put(position, temp);
        return memo.get(position);
    }


    public static void main(String[] args) {
        int[] cost = {1,100,1,1,2};
        System.out.println(minCostClimbingStairs(cost));


    }
}
