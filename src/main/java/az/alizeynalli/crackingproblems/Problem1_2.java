package az.alizeynalli.crackingproblems;

public class Problem1_2 {
    public String reverse(String value) {
        int start = 0;
        int end = value.length() - 1;
        StringBuilder builder = new StringBuilder(value);
        while (start < end) {
            char temp = builder.charAt(start);
            //    builder.charAt(start) = builder.charAt(end);
            //    builder.charAt(end) = temp;
            start++;
            end--;
        }
        return value;
    }
}
