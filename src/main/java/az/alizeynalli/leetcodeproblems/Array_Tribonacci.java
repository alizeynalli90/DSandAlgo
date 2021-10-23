package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/n-th-tribonacci-number/
public class Array_Tribonacci {

    public int tribonacci(int n) {

        int[] F = new int[38];
        F[0] = 0;
        F[1] = 1;
        F[2] = 1;
        for (int i = 3; i <= 37; i++) {
            F[i] = F[i - 1] + F[i - 2] + F[i - 3];
        }
        return F[n];
    }
}
