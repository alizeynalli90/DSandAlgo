package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/binary-search/
public class BS_BinarySearch {

    public static int search(int[] numbers, int target) {
        return rec(numbers, 0, numbers.length-1, target);
    }

    private static int rec(int[] numbers, int start, int end, int target){
        int middle = (start + end)/2;
        if(start > end){
            return -1;
        }
        if(numbers[middle] > target){
           return rec(numbers, start, middle-1, target);
        }
        if(numbers[middle] < target ){
           return rec(numbers, middle+1, end, target);
        }
        return middle;
    }

    public static void main(String[] args) {
        int[] odd = {-3, 2, 5, 7, 8};
        int[] even = {-3, 2, 5, 7, 8, 9};
        System.out.println(search(odd, 7));
        System.out.println(search(odd, 15));
        System.out.println(search(even, 2));
        System.out.println(search(even, -6));
    }
}
