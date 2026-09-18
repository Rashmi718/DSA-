package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationalSum {

    private static void Helper(int index , int[] arr , int sum , int target , List<List<Integer>> res , List<Integer> temp){
        if(sum == target){
            res.add(new ArrayList<>(temp));
            return;
        }

        if (index == arr.length || sum > target) {
            return;
        }

        if(sum + arr[index] <= target){
            temp.add(arr[index]);
            Helper(index + 1,arr, sum+arr[index] , target ,res,temp);
            temp.remove(temp.size()-1);
        }

        Helper(index+1,arr,sum,target,res,temp);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        Helper(0 , candidates , 0 , target , res , temp);
        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        res = combinationSum(new int[] {10,1,2,7,6,1,5} , 8);
        for(List<Integer> l : res){
            for(Integer i : l){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
