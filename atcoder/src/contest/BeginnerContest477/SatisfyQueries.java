package contest.BeginnerContest477;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SatisfyQueries {

    private static boolean isSubstring(String s , int l , int r , String t){
        int start = l - 1;
        int end = r - 1;

        if ((end - start + 1) < t.length()) {
            return false;
        }

        String sub = s.substring(start, end + 1);
        return sub.contains(t);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Q =  Integer.parseInt(br.readLine());
        String s = br.readLine();
        String t = br.readLine();

        ArrayList<int[]> queries = new ArrayList<>();
        for(int i = 0; i < Q; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            queries.add(new int[] {l,r});
        }

        for(int i = 0 ;i < queries.size(); i++){
            int l = queries.get(i)[0];
            int r = queries.get(i)[1];

            if(isSubstring(s,l,r,t)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
