package DSAMonday.DSAMONDAY_013;

import java.util.Arrays;
import java.util.Scanner;

public class VaccineDistribution {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] vaccines = new int[n];
        int[] patients = new int[n];

        for(int i = 0; i < n ; i++){
            vaccines[i] = ob.nextInt();
        }

        for(int i = 0; i < n ; i++){
            patients[i] = ob.nextInt();
        }

        Arrays.sort(vaccines);
        Arrays.sort(patients);

        boolean res = true;
        for(int i = 0; i < n ; i++){
            if(patients[i] > vaccines[i]){
                res = false;
                break;
            }
        }

        if(res){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
