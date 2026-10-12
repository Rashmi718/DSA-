package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class DetonateBomb {

    private static int dfs(int source ,ArrayList<ArrayList<Integer>> adj , boolean[] vis){
        vis[source]=true;
        int count=1;
        for(int v:adj.get(source)){
            if(!vis[v]){
                count += dfs(v,adj,vis);
            }
        }
        return count;
    }

    public static int maximumDetonation(int[][] bombs) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = bombs.length;
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int[] a = bombs[i];
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                int[] b = bombs[j];
                long dx = (long) b[0] - a[0];
                long dy = (long) b[1] - a[1];
                if (dx * dx + dy * dy <= (long) a[2] * a[2]) {
                    adj.get(i).add(j);
                }
            }
        }

        boolean[] vis = new boolean[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            Arrays.fill(vis,false);
            max = Math.max(max,dfs(i,adj,vis));
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] bombs = {
                {1, 2, 3},
                {2, 3, 1},
                {3, 4, 2},
                {4, 5, 3},
                {5, 6, 4}
        };

        System.out.println(maximumDetonation(bombs));
    }
}
