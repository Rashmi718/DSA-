package Graph;

import java.util.ArrayList;

public class UnreachableNodes {

    private static int totalNodes(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[node] = true;

        int count = 1;
        for (int child : adj.get(node)) {
            if (!visited[child]) {
                count += totalNodes(child, adj, visited);
            }
        }
        return count;
    }

    public static long countPairs(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        boolean[] visited = new boolean[n];
        ArrayList<Integer> comp = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            int c = 0;
            if(!visited[i]){
                c = totalNodes(i , adj , visited);
            }
            comp.add(c);
        }

        long pair = 0;
        for(int i = 0 ; i < comp.size() ; i++){
            for(int j = i + 1 ; j < comp.size() ; j++){
                pair += comp.get(i)*comp.get(j);
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        int[][] edges = new int[][] {
                {0, 2},
                {0, 5},
                {2, 4},
                {1, 6},
                {5, 4}
        };

        System.out.println(countPairs(7 ,edges));
    }
}
