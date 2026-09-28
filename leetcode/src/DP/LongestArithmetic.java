package DP;

import java.util.Arrays;

public class LongestArithmetic {

    static int[][] dp;
    private static int helper(int currIndex , int prevIndex , int[] arr , int diff){
        if(currIndex  >= arr.length) {
            return 0;
        }

        if(dp[currIndex][prevIndex]!= - 1) return dp[currIndex][prevIndex];

        int res = 0;
        int prevValue = arr[prevIndex];
        int currValue = arr[currIndex];

        if(currValue - prevValue == diff){
            res = Math.max(res, 1 + helper(currIndex+1,currIndex,arr,diff));
        }else{
            res = Math.max(res, helper(currIndex+1,prevIndex,arr,diff));
        }

        return dp[currIndex][prevIndex] = res;
    }

    public static int longestSubsequence(int[] arr, int difference) {
        int n = arr.length;
        dp = new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int max = 0;
        for(int i = 0; i < arr.length ; i++){
            max = Math.max(max , 1 + helper(i + 1 , i , arr , difference));
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestSubsequence(new int[] {1,2,3,4} , 1));
    }
}
