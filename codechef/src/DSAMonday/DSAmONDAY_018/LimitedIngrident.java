package DSAMonday.DSAmONDAY_018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LimitedIngrident {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long W = Long.parseLong(br.readLine());
        int N = Integer.parseInt(br.readLine());

        long[] A = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(A);

        long currentWeight = 0;
        int unitsCount = 0;

        for (int i = N - 1; i >= 0; i--) {
            currentWeight += A[i];
            unitsCount++;
            if (currentWeight >= W) {
                System.out.println(unitsCount);
                return;
            }

            currentWeight += A[i];
            unitsCount++;
            if (currentWeight >= W) {
                System.out.println(unitsCount);
                return;
            }
        }
        System.out.println(-1);
    }
}
