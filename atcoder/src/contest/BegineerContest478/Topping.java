package contest.BegineerContest478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Topping {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] w = new int[W + 1];
        for (int i = 1; i <= W; i++) {
            w[i] = Integer.parseInt(st2.nextToken());
        }

        long max = 0;

        for (int i = 1; i <= W; i++) {
            for (int j = i + 1; j <= W; j++) {
                for (int k = j + 1; k <= W; k++) {

                    int totalPrice = i + j + k;
                    if (totalPrice <= C) {
                        long totalHappiness = w[i] + w[j] + w[k];
                        if (totalHappiness > max) {
                            max = totalHappiness;
                        }
                    }
                }
            }
        }

        System.out.println(max);
    }
}
