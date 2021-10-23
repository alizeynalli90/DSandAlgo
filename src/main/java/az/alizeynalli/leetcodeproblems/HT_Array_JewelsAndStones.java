package az.alizeynalli.leetcodeproblems;

import java.util.HashSet;

// https://leetcode.com/problems/jewels-and-stones/
public class HT_Array_JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelSet = new HashSet<>();
        int res = 0;
        for (int j = 0; j < jewels.length(); j++) {
            if (!jewelSet.contains(jewels.charAt(j))) {
                jewelSet.add(jewels.charAt(j));
            }
        }
        for (int s = 0; s < stones.length(); s++) {
            if (jewelSet.contains(stones.charAt(s))) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aTP", "aaTTcdPP"));
    }
}
