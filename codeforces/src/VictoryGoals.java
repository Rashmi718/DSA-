import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VictoryGoals {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n - 1];
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }

            if(sum < 0){
                System.out.println(-1 * sum);
            }else {
                System.out.println(-1 * sum);
            }
        }
    }
}
