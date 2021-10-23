package az.alizeynalli.crackingproblems;

public class Problem1_3 {
    public static String removeDuplicate(String input) {
        StringBuffer buffer = new StringBuffer(input);
        for (int i = 0; i < buffer.length(); i++) {
            for (int j = 1; j < buffer.length(); j++) {
                if (buffer.charAt(i) == buffer.charAt(j)) {
                    buffer.delete(j, j + 1);
                }
            }
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicate("AAsdDDasxXxx"));
    }
}
