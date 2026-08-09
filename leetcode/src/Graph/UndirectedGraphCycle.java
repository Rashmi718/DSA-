package Graph;

import java.util.ArrayList;

public class UndirectedGraphCycle {

    public boolean dfs(int source , ArrayList<ArrayList<Integer>> adj , boolean[] visited , int parent){
        visited[source] = true;
        for(int node : adj.get(source)){
            if(!visited[node]){
                if(dfs(node , adj , visited , source)) return true;
            }

            else if(node != parent) return true;
        }

        return false;
    }

    public boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V ; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[V];
        for(int i = 0; i < V ; i++){
            if(!visited[i]){
                if(dfs(i , adj , visited , -1)) return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        UndirectedGraphCycle ob = new UndirectedGraphCycle();
        int edges[][] = {{0, 1}, {0, 2}, {1, 2}, {2, 3}};
        System.out.println(ob.isCycle(4 , edges));
    }
}
