package DSAMonday.DSAMONDAY_022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExamResult {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int correct = Integer.parseInt(st.nextToken());
        int points = Integer.parseInt(st.nextToken());
        int wrong = Integer.parseInt(st.nextToken());
        int deduct = Integer.parseInt(st.nextToken());
        int minMarks = Integer.parseInt(st.nextToken());

        int total = (correct * points) - (wrong * deduct);

        if(total >= minMarks){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
