package az.alizeynalli.leetcodeproblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SW_PermutationinString {
    public static boolean checkInclusion(String s1, String s2) {

        Map<Character, Integer> perm = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            calcPerm(perm, s1, i);
        }
        int size = s1.length();
        int i = 0;
        while(i + size <= s2.length()){
            Map<Character, Integer> temp = new HashMap<>();
            int n = i;
            while( n < i + size){
                calcPerm(temp, s2, n);
                n++;
            }
            if(checkIfPerm(perm, temp)){
                return true;
            }
            i++;
        }
        return false;
    }

    private static void calcPerm(Map<Character, Integer> window, String s1, int i){
            if(window.containsKey(s1.charAt(i))){
                Integer frequency = window.get(s1.charAt(i)) + 1;
                window.put(s1.charAt(i), frequency);
            } else {
                window.put(s1.charAt(i), 1);
            }
    }

    private static boolean checkIfPerm(Map<Character, Integer> first, Map<Character, Integer> sec){
        if(first.size() == sec.size()){
            for(Character c : first.keySet()){
                if(!first.get(c).equals(sec.get(c))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        String s1 = "add";
        String s2 = "dcda";

        System.out.println(checkInclusion(s1, s2));
    }
}