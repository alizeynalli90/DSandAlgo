package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/richest-customer-wealth/
public class Array_RichestCustomer {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int row = 0; row < accounts.length; row++) {
            int temp = 0;
            for (int column = 0; column < accounts[row].length; column++) {
                temp += accounts[row][column];
            }
            result = max(result, temp);
        }
        return result;
    }

    private int max(int a, int b) {
        return a < b ? b : a;
    }
}
