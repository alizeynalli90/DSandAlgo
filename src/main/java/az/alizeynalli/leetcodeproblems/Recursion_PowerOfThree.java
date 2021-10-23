package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/power-of-three/
public class Recursion_PowerOfThree {
    public boolean isPowerOfThree(int n) {
        return recurse(n);
    }

    private boolean recurse(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0 || n % 3 != 0) {
            return false;
        }

        return recurse(n / 3);
    }

    public boolean isPowerOfThreeLoop(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }
}
