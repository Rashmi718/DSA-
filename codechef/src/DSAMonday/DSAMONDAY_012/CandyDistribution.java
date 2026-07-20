package DSAMonday.DSAMONDAY_012;

import java.util.Scanner;

public class CandyDistribution {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        long children = ob.nextLong();
        long candies = ob.nextLong();

        long[] demand = new long[(int) children];
        for(int i = 0; i < children ; i++){
            demand[i] = ob.nextLong();
        }

        long totalDemand = 0;
        for(long d : demand){
            totalDemand += d;
        }

        if(totalDemand <= candies){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
