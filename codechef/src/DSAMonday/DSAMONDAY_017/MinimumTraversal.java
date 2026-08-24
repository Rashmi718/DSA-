package DSAMonday.DSAMONDAY_017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MinimumTraversal {

    static int solve(ArrayList<ArrayList<int[]>> adj, boolean[] vis, int src, int dst) {

        if (src == dst)
            return 0;
        vis[src] = true;
        int ans = Integer.MAX_VALUE;
        for (int[] edge : adj.get(src)) {
            int node = edge[0];
            int cost = edge[1];

            if (!vis[node]) {
                int res = solve(adj, vis, node, dst);

                if (res != Integer.MAX_VALUE)
                    ans = Math.min(ans, cost + res);
            }
        }
        vis[src] = false;
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new  StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i = 0; i <= N; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++){
            st = new  StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adj.get(x).add(new int[]{y, 0});
            adj.get(y).add(new int[]{x, 1});
        }

        boolean[] visited = new boolean[N + 1];

        int ans = solve(adj , visited , 1, N);
        if(ans == Integer.MAX_VALUE){
            System.out.println(-1);
        }else {
            System.out.println(ans);
        }
    }
}
