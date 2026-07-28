package DP;

import java.util.Arrays;
import java.util.List;

public class WordBreak {
    Boolean[] dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        dp = new Boolean[s.length()];
        Arrays.fill(dp , null);
        return Helper(0 , s , wordDict);
    }

    public boolean Helper(int index , String s , List<String> wordDict){
        if(index == s.length()){
            return true;
        }

        if(dp[index] != null) return dp[index];

        for(int i = index + 1 ; i <= s.length() ; i++){
            if(wordDict.contains(s.substring(index , i)) && Helper(i , s , wordDict)){
                dp[index] =  true;
                return true;
            }
        }

        dp[index] = false;
        return dp[index];
    }

    public static void main(String[] args) {
        WordBreak ob = new WordBreak();
        boolean res = ob.wordBreak("catsandog" , List.of(new String[]{"cats","dog","sand","and","cat"}));
        if(res){
            System.out.println("all found");
        }else{
            System.out.println("not found");
        }
    }
}
