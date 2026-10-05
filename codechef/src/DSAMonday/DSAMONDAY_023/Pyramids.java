package DSAMonday.DSAMONDAY_023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pyramids {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int steps = 0;
            int count = 1;

            while(N > 0){
                if(N - count >= 0){
                    N -= count;
                    steps++;
                    count++;
                }else{
                    break;
                }
            }

            System.out.println(steps);
        }
    }
}
