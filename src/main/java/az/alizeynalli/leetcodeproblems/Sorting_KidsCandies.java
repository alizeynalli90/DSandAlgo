package az.alizeynalli.leetcodeproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class Sorting_KidsCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> list = Arrays.stream(candies).boxed().collect(Collectors.toList());
        Collections.sort(list);
        int greatestNumber = list.get(list.size()-1).intValue();
        List<Boolean> res = new ArrayList<>();
        for(int i= 0; i< candies.length;i++){
            if(candies[i]+extraCandies >= greatestNumber){
                res.add(i, true);
            } else {
                res.add(i, false);
            }
        }
        return res;
    }
}
