package az.alizeynalli.leetcodeproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/count-items-matching-a-rule/
public class Array_CountItemsMatchingRule {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            if (ruleKey == "type" && ruleValue == item.get(0)) {
                count++;
            }
            if (ruleKey == "color" && ruleValue == item.get(1)) {
                count++;
            }
            if (ruleKey == "name" && ruleValue == item.get(2)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] first = {"phone", "blue", "pixel"};
        String[] second = {"computer", "silver", "lenovo"};
        String[] third = {"phone", "gold", "iphone"};
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList(first));
        items.add(Arrays.asList(second));
        items.add(Arrays.asList(third));
        countMatches(items, "color", "silver");
    }

}
