package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class Array_CheckIfTwoStringsEqual {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for (String s : word1) {
            s1 += s;
        }
        for (String s : word2) {
            s2 += s;
        }
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String[] word1 = {"a", " bc"};
        String[] word2 = {"ab", " c"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
