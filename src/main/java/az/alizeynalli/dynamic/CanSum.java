package az.alizeynalli.dynamic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CanSum {

    // time: O(n^m) space: O(n)
    public static boolean canSum(int target, int[] numbers) {
        if (target == 0) return true;
        if (target < 0) return false;
        for (int number : numbers) {
            if (canSum(target - number, numbers)) {
                return true;
            }
        }
        return false;
    }

    // time: O(m*n) space: O(n)
    public static boolean canSumMemo(int target, int[] numbers, Map<Integer, Boolean> map) {
        if (map.containsKey(target)) {
            return true;
        }
        if (target == 0) return true;
        if (target < 0) return false;
        for (int number : numbers) {
            if (canSum(target - number, numbers)) {
                map.put(target - number, true);
                return true;
            }
        }
        map.put(target, false);
        return false;
    }

    // time: O(m*n) space: O(n)
    public static boolean canSumTabu(int target, int[] numbers) {
        boolean[] tabu = new boolean[target + 1];
        Arrays.fill(tabu, false);
        tabu[0] = true;

        for (int i = 0; i <= target; i++) {
            if (tabu[i]) {
                for (int j = 0; j < numbers.length; j++) {
                    if (i + numbers[j] <= target) {
                        tabu[i + numbers[j]] = true;
                    }
                }
            }

        }
        return tabu[target];
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        int[] test = {7, 14};
        System.out.println(canSum(7, test));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - a));
        System.out.println(canSum(300, test));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - a));
        System.out.println("+++Memo+++");
        long b = System.currentTimeMillis();
        System.out.println(canSumMemo(7, test, new HashMap<>()));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - b));
        System.out.println(canSumMemo(300, test, new HashMap<>()));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - b));
        System.out.println("+++Tabu+++");
        long c = System.currentTimeMillis();
        System.out.println(canSumTabu(7, test));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - c));
        System.out.println(canSumTabu(300, test));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - c));
    }
}
