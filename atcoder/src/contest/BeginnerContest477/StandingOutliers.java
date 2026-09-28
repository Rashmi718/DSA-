package contest.BeginnerContest477;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class StandingOutliers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int D =  Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] people = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            people[i] = Integer.parseInt(st2.nextToken());
        }

        int p = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            boolean sd = true;
            for (int j = 1 ; j <= N; j++) {
                if(j != i){
                    int d = Math.abs(people[j] - people[i]);
                    if(d < D){
                        sd = false;
                        break;
                    }
                }
            }

            if(sd){
                p++;
                res.add(i);
            }
        }

        Collections.sort(res);
        System.out.println(p);
        for(int i = 0; i < res.size(); i++){
            System.out.print(res.get(i) + " ");
        }

        System.out.println();
    }
}

