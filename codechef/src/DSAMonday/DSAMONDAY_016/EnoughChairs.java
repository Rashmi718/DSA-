package DSAMonday.DSAMONDAY_016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EnoughChairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int table =  Integer.parseInt(st.nextToken());
        int chairs = Integer.parseInt(st.nextToken());
        int student =  Integer.parseInt(st.nextToken());

        if((table * chairs) >= student){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
