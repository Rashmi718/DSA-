package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ClosestNode {

    private static void BFS(ArrayList<ArrayList<Integer>> adj, int src , boolean[] visited , int[] dist){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited[src]=true;
        dist[src]=0;
        while(!q.isEmpty()){
            int cur = q.poll();
            for(int next : adj.get(cur)){
                if(!visited[next]){
                    dist[next]=dist[cur]+1;
                    visited[next]=true;
                    q.add(next);
                }
            }
        }
    }

    public static int closestMeetingNode(int[] edges, int node1, int node2) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = edges.length;
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        int currNode = 0;
        for(int e : edges){
            if(e != -1){
                adj.get(currNode).add(e);
            }
            currNode++;
        }

        boolean[] visited1 = new boolean[n];
        int[] dist1 = new int[n];
        Arrays.fill(dist1,Integer.MAX_VALUE);

        boolean[] visited2 = new boolean[n];
        int[] dist2 = new int[n];
        Arrays.fill(dist2,Integer.MAX_VALUE);

        BFS(adj, node1, visited1, dist1);
        BFS(adj, node2, visited2, dist2);

        int min = Integer.MAX_VALUE;
        int node = -1;
        for(int i = 0; i < n ; i++){
            if(visited1[i] == true && visited2[i] == true){
                int max = Math.max(dist1[i],dist2[i]);
                if(max <  min){
                    min=max;
                    node = i;
                }
            }
        }
        return node;
    }

    public static void main(String[] args) throws IOException {
        int[] edges = new int[]{-1,0};
        System.out.println(closestMeetingNode(edges,1,0));
    }
}
