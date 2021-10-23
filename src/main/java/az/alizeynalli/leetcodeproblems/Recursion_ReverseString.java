package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/reverse-string/
public class Recursion_ReverseString {
    public void reverseString(char[] s) {
        reverseRecursive(s, 0, s.length - 1);
    }

    private void reverseRecursive(char[] s, int low, int high) {
        if (low >= high) {
            return;
        }
        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;
        reverseRecursive(s, low + 1, high - 1);
    }
}
