package StartersContest.STARTERS249;

import java.util.Scanner;

public class BuyingGPU {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        int t = ob.nextInt();

        while (t-- > 0) {

            long x = ob.nextLong();
            long y = ob.nextLong();
            long z = ob.nextLong();

            if (z <= y) {
                System.out.println(-1);
                continue;
            }

            long profit = z - y;

            long months = (x + profit - 1) / profit;

            System.out.println(months);
        }
    }
}