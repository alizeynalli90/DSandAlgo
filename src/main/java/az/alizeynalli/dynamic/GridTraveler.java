package az.alizeynalli.dynamic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GridTraveler {
    // time: O(2^(m+n)) space: O(m+n)
    public static int travel(int m, int n) {
        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;
        return travel(m - 1, n) + travel(m, n - 1);
    }

    // time: O(m*n) space: O(m+n)
    public static int travelMemo(int m, int n, Map<String, Integer> memo) {
        String key = m + "," + n;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;
        memo.put(key, travel(m - 1, n) + travel(m, n - 1));
        return memo.get(key);
    }

    public static int travelTabu(int m, int n) {
        int[][] tabu = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            Arrays.fill(tabu[i], 0);
        }

        tabu[1][1] = 1;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                int current = tabu[i][j];
                if (j + 1 <= n) tabu[i][j + 1] += current;
                if (i + 1 <= m) tabu[i + 1][j] += current;
            }
        }
        return tabu[m][n];
    }

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(travel(3, 3));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - a));
        System.out.println(travel(5, 5));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - a));
        System.out.println(travel(15, 15));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - a));
        System.out.println("+++Memo+++");
        long b = System.currentTimeMillis();
        System.out.println(travelMemo(3, 3, new HashMap<>()));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - b));
        System.out.println(travelMemo(5, 5, new HashMap<>()));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - b));
        System.out.println(travelMemo(15, 15, new HashMap<>()));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - b));
        System.out.println("+++Tabu+++");
        long c = System.currentTimeMillis();
        System.out.println(travelTabu(3, 3));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - c));
        System.out.println(travelTabu(5, 5));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - c));
        System.out.println(travelTabu(15, 15));
        System.out.println("elapsed time: " + (System.currentTimeMillis() - c));
    }
}
