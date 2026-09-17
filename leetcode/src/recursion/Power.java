package recursion;

import java.util.ArrayList;

public class Power {

    private static void Helper(int index , String temp , String s , ArrayList<String> res){
        if(index==s.length()){
            res.add(temp);
            return;
        }

        Helper(index+1,temp + s.charAt(index) , s , res);
        Helper(index+1, temp  , s , res);
    }
    public static ArrayList<String> powerSet(String s) {
        ArrayList<String> res = new ArrayList<>();
        Helper(0 , "" , s , res);
        return res;
    }

    public static void main(String[] args) {
        ArrayList<String> res = powerSet("a");
        for(String s : res){
            System.out.println(s);
        }
    }
}
