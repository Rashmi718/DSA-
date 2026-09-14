package DSAMonday.DSAMONDAY_020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        HashMap<Integer, Integer> map1 = new HashMap<>();

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st1.nextToken());
            map1.put(A[i], map1.getOrDefault(A[i], 0) + 1);
        }

        int M  = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] B = new int[M];
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st2.nextToken());
            map2.put(B[i], map2.getOrDefault(B[i], 0) + 1);
        }

        HashSet<Integer> res = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(A[i]);
        }

        for(int i = 0; i < M ; i++){
            if(!set.contains(B[i])){
                res.add(B[i]);
            }else{
                int f1 = map1.get(B[i]);
                int f2 = map2.get(B[i]);

                if(f1 < f2){
                    res.add(B[i]);
                }
            }
        }

        if (res.isEmpty()) {
            System.out.println(-1);
            return;
        }


        ArrayList<Integer> ans = new ArrayList<>();
        Iterator<Integer> it = res.iterator();
        while(it.hasNext()){
            ans.add(it.next());
        }

        Collections.sort(ans);
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}
