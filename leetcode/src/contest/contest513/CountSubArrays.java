package contest.contest513;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CountSubArrays {
    class Pair{
        int odd;
        int even;
        Pair(int odd , int even){
            this.odd = odd;
            this.even = even;
        }
    }

    public int countRatioSubArrays(int[] nums, int a, int b) {
        int n = nums.length;
        ArrayList<Pair> evenOdd = new ArrayList<>();

        int lastOdd = 0;
        int lastEven = 0;

        for(int i = 0; i < n ; i++){
            if(nums[i] % 2 == 0){
                lastEven++;
            }else{
                lastOdd++;
            }

            System.out.println(i + " here the value of lastEven = "+lastEven);
            System.out.println(i + " here the value of lastOdd = "+lastOdd);

            Pair p = new Pair(lastOdd , lastEven);
            evenOdd.add(p);
        }

        int req = a / b;
        int count = 0;
        for(int i = 0; i < n ; i++){
            Pair p = evenOdd.get(i);
            System.out.println("pair value at "+ i +" is " + p.even +" "+ p.odd);
            int r = 0;
            if(p.odd > 0){
                r = p.even/p.odd;
            }

            if(r <= req) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        CountSubArrays c = new CountSubArrays();
        System.out.println(c.countRatioSubArrays(new int[]{1,2,1,2} , 3 , 2));
    }
}
