package az.alizeynalli.leetcodeproblems;

import java.util.Map;

public class DP_MinCost {
    public static int minCostClimbingStairs(int[] cost) {
        // cost[1] < cost[0] + cost[2] ?  calculate(cost, 0, 1, new HashMap<>()) : calculate(cost, 0, 0, new HashMap<>());
        return 0;
    }

    private static int calculate(int[] cost, int price, int position, Map<Integer, Integer> memo) {
        if (memo.containsKey(position)) {
            memo.get(position);
        }
        if (position >= cost.length) {
            memo.put(position, price);
            return memo.get(position);
        }
        if (position < cost.length) {
            price += cost[position];
            int a = calculate(cost, price, position + 1, memo);
            int b = calculate(cost, price, position + 2, memo);
            price = compare(a, b);
        }
        memo.put(position, price);
        return memo.get(position);
    }

    private static int compare(int a, int b) {
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        int[] test = {10, 15, 20};

        System.out.println(minCostClimbingStairs(test));
    }
}
