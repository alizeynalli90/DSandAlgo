package az.alizeynalli.dynamic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowSum {

    public static List<Integer> howsumBF(int target, List<Integer> nums){
        if(target == 0){
            return new ArrayList<>();
        }
        if(target < 0){
            return null;
        }

        for (Integer element: nums
             ) {
           Integer remainder = target - element;
           List<Integer> list = howsumBF(remainder, nums);
           if( list != null){
               list.add(element);
               return list;
           }

        }
        return null;
    }

    public static List<Integer> howsumMemo(int target, List<Integer> nums, Map<Integer, List<Integer>> memo){
        if(memo.containsKey(target)){
            return memo.get(target);
        }
        if(target == 0){
            return new ArrayList<>();
        }
        if(target < 0){
            return null;
        }

        for (Integer element: nums
        ) {
            Integer remainder = target - element;
            List<Integer> list = howsumBF(remainder, nums);
            if( list != null){
                list.add(element);
                memo.put(remainder, list);
                return memo.get(remainder);
            }

        }
        return null;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        List<Integer> result = howsumBF(7, list);
        System.out.println(result);
        List<Integer> resultMemo = howsumMemo(7, list, new HashMap<>());
        System.out.println(resultMemo);
    }
}
