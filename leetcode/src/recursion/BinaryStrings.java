package recursion;

import java.util.ArrayList;

public class BinaryStrings {
    public static ArrayList<String> binaryStrings(int n , String s , ArrayList<String> res) {
        if(s.length() == n){
            res.add(s);
            return res;
        }

        binaryStrings(n , s +"0", res);

        if(s.isEmpty() || s.charAt(s.length()-1) != '1'){
            binaryStrings(n , s + '1', res);
        }

        return res;
    }

    public static void main(String[] args) {
        ArrayList<String> res = binaryStrings(5,"",new ArrayList<>());
        for(String s:res){
            System.out.println(s);
        }
    }
}
