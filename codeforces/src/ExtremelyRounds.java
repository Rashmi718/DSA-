import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtremelyRounds {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String s = br.readLine();
            int length = s.length();
            int firstDigit = s.charAt(0) - '0';
            int res = 9 * (length - 1) + firstDigit;
            System.out.println(res);
        }
    }
}
