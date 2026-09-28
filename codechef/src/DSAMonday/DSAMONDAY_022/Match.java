package DSAMonday.DSAMONDAY_022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Match {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[][] A = new int[N][N];
        int[][] B = new int[M][M];

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
                map1.put(A[i][j], map1.getOrDefault(A[i][j], 0) + 1);
            }
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
                map2.put(B[i][j], map2.getOrDefault(B[i][j], 0) + 1);
            }
        }

        boolean flag = true;

        for(Map.Entry<Integer, Integer> entry : map2.entrySet()){
            int key1 = entry.getKey();
            int value1 = entry.getValue();

            if(map1.containsKey(key1)){
                int value2 = map1.get(key1);
                if(value2 < value1){
                    flag = false;
                    break;
                }
            }
        }

        if(flag){
            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }
    }
}

