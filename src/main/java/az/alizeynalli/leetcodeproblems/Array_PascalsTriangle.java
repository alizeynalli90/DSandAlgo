package az.alizeynalli.leetcodeproblems;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle/
public class Array_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        return gen(numRows, new ArrayList<>());
    }

    private List<List<Integer>> gen(int numRows, List<List<Integer>> list){
        if(numRows == 1){
            List<Integer> first = new ArrayList<>();
            first.add(1);
            list.add(first);
            return list;
        }

        List<List<Integer>> target = gen(numRows-1, list);
        List<Integer> previous = target.get(target.size()-1);
        List<Integer> current = new ArrayList<>();
        current.add(1);
        for(int i = 0; i < previous.size(); i++){
            if(i + 1 < previous.size()){
                current.add(previous.get(i)+previous.get(i+1));
            }
        }
        current.add(1);
        list.add(current);
        return list;
    }
}
