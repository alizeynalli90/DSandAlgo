package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/valid-anagram/
public class HT_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int first[] = new int[256];
        int second[] = new int[256];
        for(int i=0; i < s.length(); i++){
            first[s.charAt(i)]++;
        }
        for(int j=0; j < t.length(); j++){
            second[t.charAt(j)]++;
        }
        for(int u=0; u < first.length; u++){
            if(first[u] != second[u]){
                return false;
            }
        }
        return true;
    }
}
