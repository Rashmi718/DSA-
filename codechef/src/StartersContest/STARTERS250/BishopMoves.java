package StartersContest.STARTERS250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BishopMoves {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            if ((x1 + y1) % 2 != (x2 + y2) % 2)
                System.out.println(-1);
            else if (x1 == x2 && y1 == y2)
                System.out.println(0);
            else if (Math.abs(x1 - x2) == Math.abs(y1 - y2))
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}
