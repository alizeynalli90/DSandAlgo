package az.alizeynalli.leetcodeproblems;

// https://leetcode.com/problems/first-bad-version/
public class BS_IsBadVersion {

    private static int badVersion;

    private static boolean isBadVersion(int version){

        return version >=badVersion ? true: false ;
    }

    public static int firstBadVersion(int n) {
            int start = 1;
            int end = n;

            while(start < end){
                int mid = start + (end-start)/2;
                if(isBadVersion(mid)){
                    end = mid;
                }
                else {
                    start = mid +1;
                }
            }
            return start;

    }



    public static void main(String[] args) {
        badVersion = 4;
        System.out.println(firstBadVersion(10));
    }
}


