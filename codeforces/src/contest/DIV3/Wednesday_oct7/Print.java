package contest.DIV3.Wednesday_oct7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Print {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            boolean[] vis = new boolean[n + 1];
            int[] st = new int[n];
            int p = 0;

            for (int i = 1; i <= n; i++) {
                char c = s.charAt(i - 1);
                if (c == '1') {
                    st[p++] = i;
                } else if (c == '2') {
                    if (p > 0) {
                        vis[st[--p]] = true;
                    } else {
                        vis[i] = true;
                    }
                } else if (c == '3') {
                    vis[i] = true;
                }
            }

            int cnt = 0;
            StringBuilder res = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (!vis[i]) {
                    cnt++;
                    res.append(i).append(" ");
                }
            }

            sb.append(cnt).append("\n");
            if (cnt > 0) {
                sb.append(res.toString().trim()).append("\n");
            } else {
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}
