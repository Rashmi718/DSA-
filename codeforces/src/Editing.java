import java.io.*;
import java.util.*;

public class Editing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String t = st.nextToken();

            int[] c = new int[26];
            for (int i = 0; i < t.length(); i++) {
                c[t.charAt(i) - 'A']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                char ch = s.charAt(i);
                if (c[ch - 'A'] > 0) {
                    sb.append(ch);
                    c[ch - 'A']--;
                }
            }

            String r = sb.reverse().toString();
            if (r.equals(t)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
