package StartersContest.STARTERS250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Presentation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int slide = Integer.parseInt(br.readLine());
        int leftSlide = (600 - (slide * 30))/30;
        System.out.println(leftSlide);
    }
}
