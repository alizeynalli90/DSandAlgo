package az.alizeynalli.dynamic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Fib {
    // time: O(2^n), space: O(n)
    public static int calcFib(int n) {
        if (n <= 2) {
            return 1; // returning frees stack space so space comp is O(n)
        }
        return calcFib(n - 1) + calcFib(n - 2);
    }

    // time: O(n), space: O(n)
    public static int calcFibMemo(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n <= 2) {
            return 1; // returning frees stack space so space comp is O(n)
        }
        memo.put(n, calcFibMemo(n - 1, memo) + calcFibMemo(n - 2, memo));
        return memo.get(n);
    }

    // time: O(n), space: O(n)
    public static int calcFibTab(int n) {
        int[] table = new int[n + 1];
        Arrays.fill(table, 0);
        table[1] = 1;
        for (int i = 0; i < table.length; i++) {
            if (i + 1 < table.length) table[i + 1] += table[i];
            if (i + 2 < table.length) table[i + 2] += table[i];
        }
        return table[n];
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(calcFib(3));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - a));
        System.out.println(calcFib(35));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - a));
        System.out.println(calcFib(46));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - a));
        System.out.println("+++Memo+++");
        long b = System.currentTimeMillis();
        System.out.println(calcFibMemo(3, new HashMap<Integer, Integer>()));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - b));
        System.out.println(calcFibMemo(35, new HashMap<Integer, Integer>()));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - b));
        System.out.println(calcFibMemo(46, new HashMap<Integer, Integer>()));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - b));
        System.out.println("+++Tabu+++");
        long c = System.currentTimeMillis();
        System.out.println(calcFibTab(4));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - c));
        System.out.println(calcFibTab(30));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - c));
        System.out.println(calcFibTab(45));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - c));
    }
}
