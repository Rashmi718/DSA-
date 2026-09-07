package Graph;

import java.util.*;

public class ShortestPathDAG {

    public void topoSort(int src , ArrayList<ArrayList<int[]>> adj ,Stack<Integer> stack , boolean[] visited){
        visited[src]=true;
        for(int[] n : adj.get(src)){
            if(!visited[n[0]]){
                topoSort(n[0],adj,stack,visited);
            }
        }

        stack.push(src);
    }

    public ArrayList<Integer> shortestPath(int V, int[][] edges) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i = 0; i <  V; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int u =  edge[0];
            int v = edge[1];
            int w = edge[2];

            adj.get(u).add(new int[]{v,w});
        }

        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];

        for(int i = 0; i <  V; i++){
            if(!visited[i]){
                topoSort(i,adj,stack,visited);
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        int[] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0] = 0;
        queue.offer(0);
        while(!queue.isEmpty()){
            int u = queue.poll();
            if(dist[u]!=Integer.MAX_VALUE){
                for(int[] n :  adj.get(u)){
                    if(dist[n[0]] > n[1] + dist[u]){
                        dist[n[0]] = n[1] + dist[u];
                        queue.offer(n[0]);
                    }
                }
            }
        }

        for(int i = 0; i <  V; i++){
            if(dist[i] == Integer.MAX_VALUE){
                dist[i] = -1;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i <  V; i++){
            ans.add(dist[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        ShortestPathDAG s = new ShortestPathDAG();
        int V = 6;
        int E = 7;
        int[][] edges = {{0,1,2}, {0,4,1}, {4,5,4},
                {4,2,2}, {1,2,3}, {2,3,6}, {5,3,1}};

        ArrayList<Integer> res = s.shortestPath(V, edges);
        for(int i = 0; i <  V; i++){
            System.out.print(res.get(i) + " ");
        }
    }
}
