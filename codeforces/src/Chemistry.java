import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chemistry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            String s = br.readLine();

            int[] count = new int[26];
            for (int i = 0; i < n; i++) {
                count[s.charAt(i) - 'a']++;
            }

            int oddCount = 0;
            for (int i = 0; i < 26; i++) {
                if (count[i] % 2 != 0) {
                    oddCount++;
                }
            }
            if (oddCount <= k + 1) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}
