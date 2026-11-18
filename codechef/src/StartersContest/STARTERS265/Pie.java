package StartersContest.STARTERS265;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pie {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] price = new int[N];

            int sum = 0;
            for(int i = 0; i < N ; i++){
                int val = Integer.parseInt(st.nextToken());
                price[i] = val;
                sum += val;
            }

            int i = 0 , j = 1;
            int max = Integer.MIN_VALUE;

            while(i < j && j < N){
                int sale = price[i]/2 + price[j]/2;
                max = Math.max(max , (sum - sale));
                i++;
                j++;
            }

            System.out.println(max);
        }
    }
}
