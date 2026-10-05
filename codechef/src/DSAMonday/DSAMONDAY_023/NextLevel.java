package DSAMonday.DSAMONDAY_023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextLevel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        if(x >= 60){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
