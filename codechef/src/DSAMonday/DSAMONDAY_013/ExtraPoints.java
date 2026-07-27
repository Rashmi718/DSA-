package DSAMonday.DSAMONDAY_013;

import java.util.Scanner;

public class ExtraPoints {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int x = ob.nextInt();
        int y = ob.nextInt();

        if(y >= x){
            System.out.println("UNLOCKED");
        }else{
            System.out.println(x - y);
        }
    }
}
