package StartersContest.STARTERS255;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ShuffleString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            int N =  Integer.parseInt(br.readLine());
            String A = br.readLine();
            String B = br.readLine();

           int aA = 0;
           int aB = 0;
           int bA = 0;
           int bB = 0;

           for(char c : A.toCharArray()){
               if(c=='a'){
                   aA++;
               }else if(c=='b'){
                   aB++;
               }
           }

           for(char c : B.toCharArray()){
               if(c=='a'){
                   bA++;
               }else if(c=='b'){
                   bB++;
               }
           }

           if (aA == bB && aB == bA){
               System.out.println("YES");
           }else {
               System.out.println("NO");
           }
        }
    }
}
