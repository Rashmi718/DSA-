package StartersContest.STARTERS54;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReactWeight {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            int cost = (N / 2 * 30) + ((N % 2) * 20);
            System.out.println(cost);
        }
    }
}
