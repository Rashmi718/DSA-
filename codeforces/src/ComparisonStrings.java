import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ComparisonStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;

        String line = reader.readLine();
        if (line == null) {
            return;
        }
        tokenizer = new StringTokenizer(line);
        int t = Integer.parseInt(tokenizer.nextToken());

        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            line = reader.readLine();
            if (line == null) break;
            tokenizer = new StringTokenizer(line);
            int n = Integer.parseInt(tokenizer.nextToken());

            line = reader.readLine();
            if (line == null) break;
            tokenizer = new StringTokenizer(line);
            String s = tokenizer.nextToken();

            int maxRun = 1;
            int currentRun = 1;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    currentRun++;
                } else {
                    maxRun = Math.max(maxRun, currentRun);
                    currentRun = 1;
                }
            }
            maxRun = Math.max(maxRun, currentRun);
            output.append(maxRun + 1).append("\n");
        }
        System.out.print(output);
    }
}
