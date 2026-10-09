import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrependAppend {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            int left = 0;
            int right = n - 1;

            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    left++;
                    right--;
                } else {
                    break;
                }
            }

            System.out.println(right - left + 1);
        }
    }
}
