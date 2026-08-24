package DSAMonday.DSAMONDAY_017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;

public class MostFrequentCharacters {
    static class Pair{
        char ch;
        int count;
        Pair(char ch,int count){
            this.ch=ch;
            this.count=count;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        PriorityQueue<Pair> pq=new PriorityQueue<>(
                (x , y) ->
                {
                    if(x.count == y.count){
                        return x.ch-y.ch;
                    }

                    return y.count - x.count;
                }
        );

        String str = s.toLowerCase();

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            pq.offer(new Pair(entry.getKey(),entry.getValue()));
        }

        if(!pq.isEmpty()){
            Pair p=pq.poll();
            System.out.println(p.ch);
        }
    }
}
