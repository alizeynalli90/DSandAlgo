package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/reverse-only-letters/
public class String_ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        // ASCII Upper 65-90
        // ASCII Lower 97-122
        int start = 0;
        int end = s.length() - 1;
        StringBuilder result = new StringBuilder(s);
        while (start < end) {
            if (!isEnglishLetter(s, start)) {
                start++;
            } else if (!isEnglishLetter(s, end)) {
                end--;
            } else {
                result.setCharAt(start, s.charAt(end));
                result.setCharAt(end, s.charAt(start));
                start++;
                end--;
            }
        }
        return result.toString();
    }

    private boolean isEnglishLetter(String s, int index) {
        return ((64 < ((int) s.charAt(index)) && ((int) s.charAt(index)) < 91) || (96 < ((int) s.charAt(index)) && ((int) s.charAt(index)) < 123));
    }
}
