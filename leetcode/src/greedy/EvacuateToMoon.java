package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class EvacuateToMoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cars = Integer.parseInt(st.nextToken());
            int power = Integer.parseInt(st.nextToken());
            int hours = Integer.parseInt(st.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int[] car = new int[cars];
            for(int i = 0; i < cars; i++){
                car[i] = Integer.parseInt(st2.nextToken());
            }

            StringTokenizer st3 = new StringTokenizer(br.readLine());
            long[] powers = new long[power];
            for(int i = 0; i < power; i++){
                powers[i] = Long.parseLong(st3.nextToken());
            }

            Arrays.sort(car);
            Arrays.sort(powers);

            int carIndex = cars - 1;
            int powerIndex = power - 1;
            long sum = 0;

            while (carIndex >= 0 && powerIndex >= 0){
                long pow = powers[powerIndex] * hours;
                sum += Math.min(pow , car[carIndex]);
                carIndex--;
                powerIndex--;
            }

            System.out.println(sum);
        }
    }
}
