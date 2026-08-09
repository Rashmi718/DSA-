package contest.contest514;

import java.util.Arrays;

public class MinimumTotalPrice {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        for(int i = 0, j = prices.length - 1; i < j; i++, j--){
            int t = prices[i];
            prices[i] = prices[j];
            prices[j] = t;
        }

        for(int i = 0, j = discounts.length - 1; i < j; i++, j--){
            int t = discounts[i];
            discounts[i] = discounts[j];
            discounts[j] = t;
        }

        int n = prices.length;
        int m = discounts.length;
        int index = 0;
        double sum = 0;

        while(index < n && index < m){
            double d = (prices[index] * (100 - discounts[index])) / 100.0 ;
            sum += d;
            index++;
        }

        while(index < n){
            sum += prices[index];
            index++;
        }

        return sum;
    }

    public static void main(String[] args) {
        MinimumTotalPrice ob = new MinimumTotalPrice();
        System.out.println(ob.minPrice(new int[]{100,70} , new int[]{10,40,50}));
    }
}
