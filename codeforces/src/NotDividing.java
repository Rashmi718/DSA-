import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class NotDividing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        if (!st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null) return;
            st = new StringTokenizer(line);
        }
        int t = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            if (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            int n = Integer.parseInt(st.nextToken());
            int[] a = new int[n];

            if (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            for (int i = 0; i < n; i++) {
                if (!st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                a[i] = Integer.parseInt(st.nextToken());
                if (a[i] == 1) {
                    a[i]++;
                }
            }

            for (int i = 0; i < n - 1; i++) {
                if (a[i + 1] % a[i] == 0) {
                    a[i + 1]++;
                }
            }

            for (int i = 0; i < n; i++) {
                sb.append(a[i]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
