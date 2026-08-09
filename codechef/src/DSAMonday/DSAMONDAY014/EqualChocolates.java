package DSAMonday.DSAMONDAY014;

import java.util.Scanner;

public class EqualChocolates {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int boxA = ob.nextInt();
        int chocolatesA = ob.nextInt();
        int boxB = ob.nextInt();
        int chocolatesB = ob.nextInt();

        if(boxA/boxB == chocolatesB/chocolatesA){
            System.out.println("YES");
        }else{
            System.out.println("No");
        }
    }
}
