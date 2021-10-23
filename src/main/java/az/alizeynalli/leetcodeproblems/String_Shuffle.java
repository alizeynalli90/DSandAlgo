package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/shuffle-string/
public class String_Shuffle {
    public String restoreString(String s, int[] indices) {
        char[] res = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = s.charAt(i);
        }
        String result = "";
        for (int i = 0; i < res.length; i++) {
            result += String.valueOf(res[i]);
        }
        return result;
    }
}
