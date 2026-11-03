import java.io.*;
import java.util.*;

public class NIT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            if (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            int n = Integer.parseInt(st.nextToken());

            if (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }

            int c = 0;
            boolean in = false;

            for (int i = 0; i < n; i++) {
                if (!st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                int v = Integer.parseInt(st.nextToken());

                if (v != 0) {
                    if (!in) {
                        c++;
                        in = true;
                    }
                } else {
                    in = false;
                }
            }

            if (c == 0) {
                sb.append(0).append("\n");
            } else if (c == 1) {
                sb.append(1).append("\n");
            } else {
                sb.append(2).append("\n");
            }
        }
        System.out.print(sb);
    }
}
