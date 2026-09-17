package recursion;

import java.util.ArrayList;

public class SubsequenceK {

    private static boolean helper(int index , int[] arr , int sum , int K) {
        if (index == arr.length) {
            if(sum == K) return true;
            return false;
        }

        boolean take = false;
        boolean notTake = false;

        if(sum + arr[index] < K){
            take = helper(index + 1 , arr , sum + arr[index] , K);
        }

        notTake = helper(index + 1 , arr , sum , K);

        return take || notTake;
    }

    public static boolean checkSubsequenceSum(int[] arr, int k) {
       return helper(0,arr,0,k);
    }

    public static void main(String[] args) {
        System.out.println(checkSubsequenceSum(new int[] {754, 463, 575, 21, 771, 842, 659, 227, 460, 99, 531, 162, 292, 827, 979, 10, 600, 393, 688} , 500));
    }
}
