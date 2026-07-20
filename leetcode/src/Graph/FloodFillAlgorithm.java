package Graph;

public class FloodFillAlgorithm {
    int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public boolean checkValid(int x, int y, int m, int n) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];

        if (originalColor == color)
            return image;

        dfs(sr, sc, image, originalColor, color);

        return image;
    }

    public void dfs(int sr, int sc, int[][] image, int originalColor, int color) {

        image[sr][sc] = color;

        for (int i = 0; i < 4; i++) {
            int nsr = sr + dir[i][0];
            int nsc = sc + dir[i][1];

            if (checkValid(nsr, nsc, image.length, image[0].length)
                    && image[nsr][nsc] == originalColor) {

                dfs(nsr, nsc, image, originalColor, color);
            }
        }
    }

    public static void main(String[] args) {
        FloodFillAlgorithm ob = new FloodFillAlgorithm();
        int[][] image = {{0 , 0 , 0} , {0 , 0 , 0}};
        ob.floodFill(image , 1 , 0 , 2);
        for(int i = 0; i < image.length ; i++){
            for (int j = 0; j < image[0].length ; j++){
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}
