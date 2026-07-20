package DSAMonday.DSAMONDAY_012;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GridPropagation {

    static int[][] dir = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1},{0, 1}, {1, -1},  {1, 0},  {1, 1}};

    private static int totalHours(int[][] grid, int N, int M, int val) {

        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == val) {
                    q.add(new int[]{i, j});
                }
            }
        }

        int hours = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            boolean changed = false;
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int x = curr[0];
                int y = curr[1];
                for (int j = 0; j < 8; j++) {
                    int nx = x + dir[j][0];
                    int ny = y + dir[j][1];
                    if (nx >= 0 && nx < N && ny >= 0 && ny < M && grid[nx][ny] != val) {
                        grid[nx][ny] = val;
                        q.add(new int[]{nx, ny});
                        changed = true;
                    }
                }
            }

            if (changed) hours++;
        }

        return hours;
    }

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        int T = ob.nextInt();
        while (T-- > 0) {
            int N = ob.nextInt();
            int M = ob.nextInt();

            int max = Integer.MIN_VALUE;

            int[][] grid = new int[N][M];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    grid[i][j] = ob.nextInt();
                    max = Math.max(max, grid[i][j]);
                }
            }

            System.out.println(totalHours(grid, N, M, max));
        }
        ob.close();
    }
}