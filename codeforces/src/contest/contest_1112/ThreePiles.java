package contest.contest_1112;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThreePiles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Long[] stones  = new Long[st.countTokens()];
            for(int i = 0; i < stones.length; i++){
                stones[i] = Long.parseLong(st.nextToken());
            }

            Long Alice = stones[0] + stones[2];
            Long max = Long.MIN_VALUE;

            max = Math.max(Math.abs(Alice - stones[1]) ,max);
            max = Math.max(Math.abs(stones[0] - stones[1]) , max);

            System.out.println(max);
        }
    }
}
