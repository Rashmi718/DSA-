import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ap {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null) {
            return;
        }
        int testCases = Integer.parseInt(line.trim());
        StringBuilder output = new StringBuilder();

        while (testCases-- > 0) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            long first = Long.parseLong(st.nextToken());
            long second = Long.parseLong(st.nextToken());
            long third = Long.parseLong(st.nextToken());

            if (canFormProgression(first, second, third)) {
                output.append("YES\n");
            } else {
                output.append("NO\n");
            }
        }
        System.out.print(output);
    }

    private static boolean canFormProgression(long x, long y, long z) {
        long targetFirst = 2 * y - z;
        if (targetFirst > 0 && targetFirst % x == 0) {
            return true;
        }

        long sumEnds = x + z;
        if (sumEnds % 2 == 0) {
            long targetSecond = sumEnds / 2;
            if (targetSecond > 0 && targetSecond % y == 0) {
                return true;
            }
        }

        long targetThird = 2 * y - x;
        if (targetThird > 0 && targetThird % z == 0) {
            return true;
        }

        return false;
    }
}
