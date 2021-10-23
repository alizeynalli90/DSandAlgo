package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class Array_SmallerNumbersThanCurrent {

    public int[] smallerNumbersThanCurrentBruteForce(int[] nums) {
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] < nums[i]) {
                    ++counter;
                }
            }
            result[i] = counter;
        }
        return result;
    }

    private static final int MAX_NUMBER_CONSTRAINT = 101;

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        //array memory will be used as short-term memory with max numbers from 0 to 100.
        int[] memory = new int[MAX_NUMBER_CONSTRAINT];

        //additional variable length for better reading
        final int length = nums.length;

        //answer array that will be returned
        int[] ans = new int[length];

        //this loop counts how many digits we have in nums array
        for (int num : nums) {
            memory[num]++;
        }

        //this loop checks how many numbers are before the number, meaning bigger, for example 8 has 4 number before it
        int count = 0, temp;
        for (int i = 0; i < MAX_NUMBER_CONSTRAINT && count < length; i++) {
            if (memory[i] != 0) {
                temp = memory[i];
                memory[i] = count;
                count += temp;
            }
        }

        //this loop simply copies values to answer array
        for (int i = 0; i < length; i++) {
            ans[i] = memory[nums[i]];
        }
        return ans;
    }


    public static void main(String[] args) {
        int test[] = {8, 1, 2, 2, 3};
        smallerNumbersThanCurrent(test);
    }
}
