import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OldGrasshopper {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x0 = Long.parseLong(st.nextToken());
            long n = Long.parseLong(st.nextToken());

            long rem = n % 4;
            long d = 0;

            if (rem == 1) {
                d = -n;
            } else if (rem == 2) {
                d = 1;
            } else if (rem == 3) {
                d = n + 1;
            }

            if (x0 % 2 == 0) {
                out.append(x0 + d).append('\n');
            } else {
                out.append(x0 - d).append('\n');
            }
        }
        System.out.print(out);
    }
}
