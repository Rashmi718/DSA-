package contest.BegineerContest478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class SortSubarray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        int[] original = new int[n];
        int[] sorted = new int[n];

        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            original[i] = Integer.parseInt(tokenizer.nextToken());
            sorted[i] = original[i];
        }

        Arrays.sort(sorted);

        int start = -1;
        int end = -1;

        for (int i = 0; i < n; i++) {
            if (original[i] != sorted[i]) {
                if (start == -1) {
                    start = i;
                }
                end = i;
            }
        }

        if (start == -1) {
            System.out.println("Yes");
            return;
        }

        if ((end - start + 1) > k) {
            System.out.println("No");
            return;
        }

        int lowerBound = Math.max(0, end - k + 1);
        int upperBound = Math.min(n - k, start);

        if (lowerBound <= upperBound) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
