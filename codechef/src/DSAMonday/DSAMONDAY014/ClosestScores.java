package DSAMonday.DSAMONDAY014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ClosestScores {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] parts = s.split(" ");
        long[] scores = new long[n];

        for(int i = 0; i < parts.length ; i++){
            scores[i] = Integer.parseInt(parts[i]);
        }

        Arrays.sort(scores);
        long min = Long.MAX_VALUE;
        for(int i = 1 ; i < n ; i++){
            min = Math.min(min , scores[i] - scores[i - 1]);
        }

        System.out.println(min);
    }
}
