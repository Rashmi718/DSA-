package DSAMonday.DSAMONDAY_016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChefAndGroups {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int seats =  Integer.parseInt(br.readLine());
        String group = br.readLine();

        int totalGroups = 0;
        for(int i = 0; i < seats; i++){

            if(i >= 1){
                if(group.charAt(i) == '1' && group.charAt(i - 1) == '1'){
                   totalGroups += 0;
                   continue;
                }
            }

            if(group.charAt(i) == '1'){
                totalGroups++;
            }
        }

        System.out.println(totalGroups);
    }
}
