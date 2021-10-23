package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/power-of-four/
public class Recursion_PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 4 == 0) {
            n = n / 4;
        }

        return n == 1;

    }
}
