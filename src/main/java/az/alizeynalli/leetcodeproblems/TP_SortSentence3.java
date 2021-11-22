package az.alizeynalli.leetcodeproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class TP_SortSentence3 {

    public  static String reverseWords(String s) {
        String[] splitted = s.split(" ");
        List<String> list = Arrays.asList(splitted);
        StringBuilder builder = new StringBuilder();
        for (String sp: splitted
        ) {
            char[] c = reverse(sp.toCharArray());
            builder.append(c);
            builder.append(" ");
        }
        String result = builder.substring(0, builder.length()-1);
        return result;
    }
    private static char[] reverse(char[] array){
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }


    public static void main(String[] args) {
        String s = "God Ding";
        System.out.println(reverseWords(s));
    }
}
