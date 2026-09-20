package contest.contest_476;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appender {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        if(s.charAt(0) == 'e'){
            s += 'r';
            System.out.println(s);
        }else{
            s += "er";
            System.out.println(s);
        }
    }
}
