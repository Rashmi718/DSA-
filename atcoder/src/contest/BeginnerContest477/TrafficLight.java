package contest.BeginnerContest477;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);

        if(c == 'B'){
            System.out.println("Y");
        }else if(c == 'Y'){
            System.out.println("R");
        }else if(c == 'R'){
            System.out.println("B");
        }
    }
}
