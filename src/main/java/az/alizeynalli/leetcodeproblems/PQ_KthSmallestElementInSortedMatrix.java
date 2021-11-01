package az.alizeynalli.leetcodeproblems;

import java.util.PriorityQueue;

// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
public class PQ_KthSmallestElementInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                heap.add(matrix[i][j]);
            }
        }

        while(k-- != 1){
            heap.poll();
        }
        int res = heap.poll().intValue();
        return res;
    }
}
