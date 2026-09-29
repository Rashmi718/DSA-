import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayColouring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] nums = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
                sum  += nums[i];
            }

            if(sum%2==0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
