package az.alizeynalli.leetcodeproblems;

public class Array_RotateArray {

//    public void rotate(int[] nums, int k) {
//        for(int i = 0; i < k; i++){
//            int last = nums[nums.length-1];
//            for(int j = nums.length-1; j > 0; j--){
//                nums[j] = nums[j-1];
//            }
//            nums[0] = last;
//        }
//    }

    public static void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        int counter = 0;
        while(k>0){
            temp[counter] = nums[nums.length - k];
            counter++;
            k--;
        }
        int i = 0;
        while(counter < nums.length){
            temp[counter] = nums[i];
            counter++;
            i++;
        }
        nums = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
    }
}
