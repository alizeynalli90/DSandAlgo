package az.alizeynalli.leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class HT_CheckIfPangram {
    public boolean checkIfPangram(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put((Character) alphabet.charAt(i), false);
        }

        for (int i = 0; i < sentence.length(); i++) {
            map.put((Character) sentence.charAt(i), true);
        }
        for (int i = 0; i < 26; i++) {
            if (!map.get((Character) alphabet.charAt(i))) {
                return false;
            }
            ;
        }
        return true;
    }
}
