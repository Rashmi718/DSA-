package DSAMonday.DSAMONDAY_013;

import java.util.Scanner;

public class ArrayCompression {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] ele = new int[n];

        for(int i = 0; i < n ; i++){
            ele[i] = ob.nextInt();
        }

        int same = 0;
        for(int  i = 1; i < n ; i++){
            if(ele[i] == ele[i - 1]) same++;
        }
        System.out.println(n - same);
    }
}
