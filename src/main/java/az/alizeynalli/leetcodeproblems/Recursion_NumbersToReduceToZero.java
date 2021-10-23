package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class Recursion_NumbersToReduceToZero {
    public int numberOfSteps(int num) {
        int res = 0;
        return recursiveMethod(num, res);
    }

    private int recursiveMethod(int num, int res) {
        if (num == 0) {
            return res;
        }
        if (num % 2 == 0) {
            num = num / 2;
            res = res + 1;
            return recursiveMethod(num, res);
        } else {
            num = num - 1;
            res = res + 1;
            return recursiveMethod(num, res);
        }
    }
}
