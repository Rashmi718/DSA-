package contest.contestDiv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FashionableArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] freq = new int[101];
            for (int i = 0; i < n; i++) {
                freq[Integer.parseInt(st.nextToken())]++;
            }

            StringBuilder ans = new StringBuilder();
            for(int k = 1 ; k <= n ; k++){
                for(int x = 100 ; x >= 1 ; x--){
                    if(freq[x] >= k){
                        ans.append(x).append(" ");
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
