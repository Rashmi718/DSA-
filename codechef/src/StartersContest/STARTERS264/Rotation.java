package StartersContest.STARTERS264;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rotation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int count = 0;
            if(n == 1){
                if((s.charAt(0) - '0') % 4 == 0) count++;
            } else {
                for(int i = 0 ; i < n ; i++){
                    int d1 = s.charAt(i) - '0';
                    int d2 = s.charAt((i + 1) % n) - '0';
                    int num = d1 * 10 + d2;
                    if(num % 4 == 0) count++;
                }
            }

            System.out.println(count);
        }
    }
}