import java.util.*;
import java.io.*;

public class Partition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            long n = Long.parseLong(st1.nextToken());
            long x = Long.parseLong(st1.nextToken());

            long[] arr = new long[(int)n];
            for(int i = 0; i < n ; i++){
                arr[i] = Long.parseLong(st2.nextToken());
            }

            long max =0;
            long min = 0;
            long t1 = 0;
            long t2 = 0;
            long sum1 = 0;
            long sum2 = 0;

            for(int i = 0; i < n ; i++){
                if(arr[i] % x == 0){
                    t1 += arr[i];
                    sum1 += arr[i]/x;
                }else{
                    t2 += arr[i];
                    sum1 += arr[i]/x + 1;
                }
            }

            if(t2 % x == 0){
                sum2 = t1/x + t2/x;
            }else{
                sum2 = t1/x + t2/x + 1;
            }

            min = Math.min(sum1 , sum2);
            max = Math.max(sum1 , sum2);

            System.out.println(min + " " +  max);
        }
    }
}