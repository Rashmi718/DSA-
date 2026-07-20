package Graph;

public class BattleshipsInABoard {

    int[][] dir = {{1 , 0}  , {-1 , 0} , {0 , 1} , {0 , -1}};

    public boolean checkValid(int x , int y , int m , int n){
        return x >= 0  && x < m && y >= 0 && y < n;
    }
    public int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int count = 0;

        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n ; j++){
                if(board[i][j] == 'X' && !visited[i][j]){
                    count++;
                    dfs(i , j , board , visited);
                }
            }
        }

        return count;
    }

    private void dfs(int x , int y , char[][] board , boolean[][] visited){
        visited[x][y] = true;
        for(int i = 0; i < 4 ; i++){
            int nx = x + dir[i][0];
            int ny = y + dir[i][1];
            if(checkValid(nx  , ny , board.length , board[0].length) && board[nx][ny] == 'X' && !visited[nx][ny]){
                dfs(nx , ny , board , visited);
            }
        }
    }

    public static void main(String[] args) {
        BattleshipsInABoard ob = new BattleshipsInABoard();
        char[][] board = {{'X' , '.' , '.' , 'X'} , {'.' , '.' , '.' , 'X'} , {'.' , '.' , '.' , 'X'}};
        System.out.println(ob.countBattleships(board));
    }
}
