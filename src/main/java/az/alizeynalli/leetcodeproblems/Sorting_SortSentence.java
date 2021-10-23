package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/sorting-the-sentence/
public class Sorting_SortSentence {
    public String sortSentence(String s) {
        String result = "";
        String[] splitted = s.split(" ");
        String[] sorted = new String[s.length() + 1];
        for (int i = 0; i < splitted.length; i++) {
            char charIndex = splitted[i].charAt(splitted[i].length() - 1);
            int index = charIndex - '0';
            sorted[index] = splitted[i].substring(0, splitted[i].length() - 1);
        }
        for (int j = 1; j < sorted.length; j++) {
            if (sorted[j] != null) {
                result = result + " " + sorted[j];
            }
        }
        return result.substring(1, result.length());
    }
}
