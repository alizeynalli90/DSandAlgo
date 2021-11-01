package az.alizeynalli.leetcodeproblems;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/find-center-of-star-graph/
public class Graph_FindCenter {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int i=0; i<edges.length; i++){
            int temp[] = edges[i];
            if(!map.containsKey(temp[0])){
                map.put(temp[0], 1);
            } else {
                map.put(temp[0], map.get(temp[0])+1);
            }
            if(!map.containsKey(temp[1])){
                map.put(temp[1], 1);
            } else {
                map.put(temp[1], map.get(temp[1])+1);
            }
        }
        for(Integer key : map.keySet()){
            if(map.get(key) > 1){
                result = key;
                break;
            }
        }
        return result;
    }
}
