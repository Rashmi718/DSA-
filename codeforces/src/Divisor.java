import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divisor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());

            long count = 0;
            for (long i = 1; ; i++) {
                if (n % i == 0) {
                    count++;
                } else {
                    break;
                }
            }

            System.out.println(count);
        }
    }
}
