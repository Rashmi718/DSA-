package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    static int[] X = {-1, 0, 1, 0};
    static int[] Y = {0, 1, 0, -1};

    public boolean checkValid(int x, int y, int rows, int cols) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }

    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();

        int fresh = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0)
            return 0;

        int minutes = 0;

        while (!q.isEmpty()){
            int size = q.size();
            boolean rottenThisMinute = false;

            for(int i = 0; i < size ; i++){
                int[] current = q.poll();
                int x = current[0];
                int y = current[1];

                for(int j = 0; j < 4 ; j++){
                    int nx = x + X[j];
                    int ny = y + Y[j];

                    if(checkValid(nx , ny , rows , cols) && grid[nx][ny] == 1){
                        grid[nx][ny] = 2;
                        fresh--;
                        q.offer(new int[] {nx , ny});
                        rottenThisMinute = true;
                    }
                }
            }

            if (rottenThisMinute) minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        RottenOranges ob = new RottenOranges();
        int[][] grid = {{2 , 1 , 1} , {1 , 1 , 0} , {0 , 1 , 1}};
        System.out.println(ob.orangesRotting(grid));
    }
}