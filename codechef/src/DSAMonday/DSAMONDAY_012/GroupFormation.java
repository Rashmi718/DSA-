package DSAMonday.DSAMONDAY_012;

import java.util.ArrayList;
import java.util.Scanner;

public class GroupFormation {

    static int mod = 1000000007;

    public static int dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {

        visited[node] = true;
        int size = 1;
        for (int n : adj.get(node)) {
            if (!visited[n]) {
                size += dfs(n, adj, visited);
            }
        }

        return size;
    }

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        int T = ob.nextInt();

        while (T-- > 0) {
            int N = ob.nextInt();
            int M = ob.nextInt();

            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for (int i = 0; i <= N; i++) {
                adj.add(new ArrayList<>());
            }

            for (int i = 0; i < M; i++) {
                int u = ob.nextInt();
                int v = ob.nextInt();

                adj.get(u).add(v);
                adj.get(v).add(u);
            }

            boolean[] visited = new boolean[N + 1];

            int group = 0;
            long ways = 1;
            for (int i = 1; i <= N; i++) {
                if (!visited[i]) {
                    int size = dfs(i, adj, visited);
                    ways *= size;
                    group++;
                }
            }

            System.out.println(group + " " + ways % mod);
        }

        ob.close();
    }
}