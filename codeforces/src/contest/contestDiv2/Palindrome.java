package contest.contestDiv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Palindrome {
    private static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private static int minimumSteps(String s , char c){
        int i = 0;
        int j = s.length()-1;

        int cost = 0;
        while(i < j){
            if(s.charAt(i)!=s.charAt(j) && s.charAt(i)!= c && s.charAt(j)!= c){
                cost += 2;
            }else if(s.charAt(i) != s.charAt(j) && (s.charAt(i) == c || s.charAt(j) == c)){
                cost += 1;
            }

            i++;
            j--;
        }

        return cost;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            StringTokenizer s = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(s.nextToken());
            char c = s.nextToken().charAt(0);

            String word = br.readLine();

            if(isPalindrome(word)){
                System.out.println(0);
            }else{
                System.out.println(minimumSteps(word, c));
            }
        }
    }
}
