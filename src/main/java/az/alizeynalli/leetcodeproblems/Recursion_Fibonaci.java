package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/fibonacci-number/
public class Recursion_Fibonaci {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
