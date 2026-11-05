import java.io.*;
import java.util.*;

public class Anotus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            if (n % 2 != 0 || n < 4) {
                sb.append("-1\n");
            } else {
                long min = (n + 5) / 6;
                long max = n / 4;
                sb.append(min).append(" ").append(max).append("\n");
            }
        }
        System.out.print(sb);
    }
}
