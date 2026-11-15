import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Balance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            char[] s = br.readLine().toCharArray();
            int n = s.length;

            int ab = 0;
            int ba = 0;

            for (int i = 1; i < n; i++) {
                if (s[i - 1] == 'a' && s[i] == 'b') {
                    ab++;
                } else if (s[i - 1] == 'b' && s[i] == 'a') {
                    ba++;
                }
            }

            while (ab != ba) {
                if (ab > ba) {
                    if (s[0] == 'a' && s[1] == 'b') {
                        s[0] = 'b';
                        ab--;
                    } else if (s[n - 2] == 'a' && s[n - 1] == 'b') {
                        s[n - 1] = 'a';
                        ab--;
                    } else {
                        s[0] = 'b';
                        ba++;
                    }
                } else {
                    if (s[0] == 'b' && s[1] == 'a') {
                        s[0] = 'a';
                        ba--;
                    } else if (s[n - 2] == 'b' && s[n - 1] == 'a') {
                        s[n - 1] = 'b';
                        ba--;
                    } else {
                        s[0] = 'a';
                        ab++;
                    }
                }
            }

            System.out.println(new String(s));
        }
    }
}
