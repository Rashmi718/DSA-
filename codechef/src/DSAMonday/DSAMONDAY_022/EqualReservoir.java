package DSAMonday.DSAMONDAY_022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EqualReservoir {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] vessel = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int minLevel = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            vessel[i] = Integer.parseInt(st.nextToken());
            if (vessel[i] < minLevel) {
                minLevel = vessel[i];
            }
        }

        long totalCost = 0;
        for (int i = 0; i < N; i++) {
            totalCost += (vessel[i] - minLevel);
        }

        System.out.println(totalCost);
    }
}
