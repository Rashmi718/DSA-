package DSAMonday.DSAMONDAY014;

import java.util.Scanner;

public class BalancedIngredients {

    private static boolean checkBalanced(long[] arr , int left , int right){
        long sum = 0;
        for(int i = left ; i <= right ; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        return sum == 0;
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        long[] ingredients = new long[4];
        for(int i = 0; i < 4 ; i++){
            ingredients[i] = ob.nextLong();
        }

        boolean res = false;
        for(int i = 0; i < 4 ; i++){
            for(int j = i ; j < 4 ; j++){
                if(checkBalanced(ingredients , i , j)){
                    res = true;
                    break;
                }
            }
        }

        if(res){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
