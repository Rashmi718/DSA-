package recursion;

public class JosephusProblem {
    public static int findTheWinner(int n, int k) {
        int i = 1 , ans = 0;
        while(i <= n){
            ans = (ans + k) % i;
            i++;
        }
        return ans + 1;
    }

    public static void main(String[] args) {
        int v = findTheWinner(5 , 2);
        System.out.println(v);
    }
}
