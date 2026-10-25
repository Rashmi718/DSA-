import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Balanced {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            shuffle(a);
            Arrays.sort(a);

            int maxLen = 1;
            int currentLen = 1;

            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] <= k) {
                    currentLen++;
                } else {
                    maxLen = Math.max(maxLen, currentLen);
                    currentLen = 1;
                }
            }
            maxLen = Math.max(maxLen, currentLen);

            sb.append(n - maxLen).append("\n");
        }
        System.out.print(sb);
    }

    private static void shuffle(int[] a) {
        Random rand = new Random();
        for (int i = a.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }
}
