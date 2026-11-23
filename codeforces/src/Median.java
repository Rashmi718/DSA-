import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Median {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int total = n * k;
            long[] a = new long[total];
            int idx = 0;

            while (idx < total) {
                if (!st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                a[idx++] = Long.parseLong(st.nextToken());
            }

            int step = n / 2 + 1;
            int current = total - step;
            long sum = 0;

            for (int i = 0; i < k; i++) {
                sum += a[current];
                current -= step;
            }

            out.append(sum).append('\n');
        }

        System.out.print(out);
    }
}

