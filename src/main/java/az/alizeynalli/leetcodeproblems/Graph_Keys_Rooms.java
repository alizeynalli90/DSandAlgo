package az.alizeynalli.leetcodeproblems;

import java.util.*;

// https://leetcode.com/problems/keys-and-rooms/
public class Graph_Keys_Rooms {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Map<Integer, Boolean> result = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while(!queue.isEmpty()){
            Integer current = queue.poll();
            result.put(current, true);
            for (Integer el: rooms.get(current)){
                if(!result.containsKey(el)){
                queue.add(el);
                }
            }
        }
        boolean res = true;
        for(int n = 0 ;n < rooms.size(); n++){
            if(!result.containsKey(n)){
                res = false;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> zero = Arrays.asList(1,3);
        List<Integer> one = Arrays.asList(3,0,1);
        List<Integer> two = Arrays.asList(2);
        List<Integer> three = Arrays.asList(0);
        List<List<Integer>> graph = new ArrayList<>();
        graph.add(zero);
        graph.add(one);
        graph.add(two);
        graph.add(three);
        System.out.println(canVisitAllRooms(graph));
    }
}
