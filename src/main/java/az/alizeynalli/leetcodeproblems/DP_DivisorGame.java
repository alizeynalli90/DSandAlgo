package az.alizeynalli.leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/divisor-game/
public class DP_DivisorGame {
    public boolean divisorGame(int n) {
        return divisor(n, 1, new HashMap<>());
    }

    private boolean divisor(int n, int counter, Map<Integer, Boolean> memo){
        if(memo.containsKey(n)) return memo.get(n);
        if(n == 2 && counter > 0) {
            memo.put(n, true);
            return memo.get(n);
        }

        for(int i=1; i<n; i++){
            if(n % i == 0){

                boolean x = divisor(n-i, counter*(-1), memo);
                memo.put(n-i, x);
                return memo.get(n-i);
            }
        }
        memo.put(n, false);
        return memo.get(n);
    }
}
