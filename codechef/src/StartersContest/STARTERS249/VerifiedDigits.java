package StartersContest.STARTERS249;

import java.util.Scanner;

public class VerifiedDigits {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int X = ob.nextInt();
        if((X/10) != (X % 10)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
