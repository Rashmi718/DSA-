package DSAMonday.DSAMONDAY_017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class AnagramOccurances {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String p = br.readLine();

        int[] A = new int[26];
        int[] B = new int[26];

        int m = p.length();
        int n = s.length();

        for(int i=0;i<m;i++){
            A[p.charAt(i)-'a']++;
            B[s.charAt(i)-'a']++;
        }

        ArrayList<Integer> arr=new ArrayList<>();

        if(Arrays.equals(A , B)){
            arr.add(0);
        }

        for (int i = m ; i < n ; i++){
            B[s.charAt(i)-'a']++;
            B[s.charAt(i - m)-'a']--;

            if(Arrays.equals(A , B)){
                arr.add(i - m + 1);
            }
        }

        arr.toString();
        for(int j=0;j<arr.size();j++){
            System.out.print(arr.get(j) +" ");
        }
    }
}
