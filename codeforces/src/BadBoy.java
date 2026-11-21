import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BadBoy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            long i = Long.parseLong(st.nextToken());
            long j = Long.parseLong(st.nextToken());

            long d1x1 = 1, d1y1 = 1, d1x2 = n, d1y2 = m;
            long d2x1 = 1, d2y1 = m, d2x2 = n, d2y2 = 1;

            long dist1 = Math.abs(i - d1x1) + Math.abs(j - d1y1) + Math.abs(i - d1x2) + Math.abs(j - d1y2);
            long dist2 = Math.abs(i - d2x1) + Math.abs(j - d2y1) + Math.abs(i - d2x2) + Math.abs(j - d2y2);

            if (dist1 >= dist2) {
                System.out.println(d1x1 + " " + d1y1 + " " + d1x2 + " " + d1y2);
            } else {
                System.out.println(d2x1 + " " + d2y1 + " " + d2x2 + " " + d2y2);
            }
        }
    }
}
