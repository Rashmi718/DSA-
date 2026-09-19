import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountString {

    private static boolean checkExist(String source, String target) {
        int n = source.length();
        int m = target.length();

        if (n < m) return false;

        for (int i = 0; i <= n - m; i++) {
            int j;

            for (j = 0; j < m; j++) {
                if (source.charAt(i + j) != target.charAt(j)) {
                    break;
                }
            }

            if (j == m) return true;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            String s1 = br.readLine();
            String s2 = br.readLine();

            int count = 0;

            while (!checkExist(s1, s2) && s1.length() < s2.length()) {
                s1 += s1;
                count++;
            }

            if (checkExist(s1, s2)) {
                System.out.println(count);
            } else {
                s1 += s1;
                count++;

                if (checkExist(s1, s2)) {
                    System.out.println(count);
                } else {
                    s1 += s1;
                    count++;

                    if (checkExist(s1, s2)) {
                        System.out.println(count);
                    } else {
                        System.out.println(-1);
                    }
                }
            }
        }
    }
}