package recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    private static void Helper(int n, int open, int close, String s, List<String> res) {
        if (s.length() == 2 * n) {
            res.add(s);
            return;
        }
        if (open < n) {
            Helper(n, open + 1, close, s + '(', res);
        }
        if (close < open) {
            Helper(n, open, close + 1, s + ')', res);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        Helper(n,0 , 0 , "",res);
        return res;
    }

    public static void main(String[] args) {
        List<String> ls = generateParenthesis(3);
        for (String s : ls) System.out.println(s);
    }
}
