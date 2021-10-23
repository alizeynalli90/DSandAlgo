package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/power-of-two/
public class Recursion_PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0 || n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(10));
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(9));
    }
}
