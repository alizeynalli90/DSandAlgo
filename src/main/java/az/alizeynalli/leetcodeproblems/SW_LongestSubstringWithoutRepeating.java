package az.alizeynalli.leetcodeproblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class SW_LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        int size = s.length(), result = 0;
        Map<Character, Integer> window = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < size; j++) {
            if (window.containsKey(s.charAt(j))) {
                i = Math.max(window.get(s.charAt(j)), i);
            }
            result = Math.max(result, j - i + 1);
            window.put(s.charAt(j), j + 1);
        }
        return result;
        }



    public static void main(String[] args) {
        String s = "abcabcdbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
