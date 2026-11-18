package StartersContest.STARTERS265;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Squash {

    public static boolean kLength(String s, int n, int k) {
        int count = 0;
        int j = 0;
        int i = 0;

        while (i < n) {
            while (i < n && s.charAt(i) == s.charAt(j)) {
                i++;
            }
            count++;
            j = i;
        }

        return count <= k;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            String s = br.readLine();

            int n = Integer.parseInt(st1.nextToken());
            int k = Integer.parseInt(st1.nextToken());

            if(kLength(s , n , k)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
