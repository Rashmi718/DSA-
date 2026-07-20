package DSAMonday.DSAMONDAY_012;

import java.util.*;

public class FactoryProduction {

    public static boolean itemsPossible(long time, long[] times, long target) {
        long sum = 0;

        for (long ele : times) {
            sum += time / ele;

            if (sum >= target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) throws java.lang.Exception {

        Scanner ob = new Scanner(System.in);

        long machines = ob.nextLong();
        long itemsRequired = ob.nextLong();

        long[] time = new long[(int) machines];

        long minTime = Long.MAX_VALUE;

        for (int i = 0; i < machines; i++) {
            time[i] = ob.nextLong();
            minTime = Math.min(minTime, time[i]);
        }

        long low = 1;
        long high = minTime * itemsRequired;

        while (low < high) {

            long mid = low + (high - low) / 2;

            if (itemsPossible(mid, time, itemsRequired)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(low);
    }
}