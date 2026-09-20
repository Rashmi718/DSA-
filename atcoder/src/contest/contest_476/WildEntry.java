package contest.contest_476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WildEntry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();
        String t = br.readLine();

        boolean possible = true;
        for(int i = 0; i < n; i++){
            System.out.println(s.charAt(i) + "  " + t.charAt(i));
            if(s.charAt(i) != t.charAt(i)){
                if(t.charAt(i) != '*'){
                    possible = false;
                    break;
                }
            }
        }

        if(possible){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
