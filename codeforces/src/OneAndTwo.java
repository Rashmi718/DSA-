import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OneAndTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            int totalTwos = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                if (arr[i] == 2) {
                    totalTwos++;
                }
            }

            if (totalTwos % 2 != 0) {
                System.out.println(-1);
                continue;
            }

            if (totalTwos == 0) {
                System.out.println(1);
                continue;
            }

            int currentTwos = 0;
            int ans = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 2) {
                    currentTwos++;
                }
                if (currentTwos == totalTwos / 2) {
                    ans = i + 1;
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}
