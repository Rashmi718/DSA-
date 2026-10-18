import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Objects;
import java.util.StringTokenizer;

public class Forked {
    static class Point {
        long x, y;

        Point(long x, long y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            st = new StringTokenizer(br.readLine());
            long xK = Long.parseLong(st.nextToken());
            long yK = Long.parseLong(st.nextToken());

            st = new StringTokenizer(br.readLine());
            long xQ = Long.parseLong(st.nextToken());
            long yQ = Long.parseLong(st.nextToken());

            long[] dx = {a, a, -a, -a, b, b, -b, -b};
            long[] dy = {b, -b, b, -b, a, -a, a, -a};

            HashSet<Point> kingPositions = new HashSet<>();
            HashSet<Point> queenPositions = new HashSet<>();

            for (int i = 0; i < 8; i++) {
                kingPositions.add(new Point(xK + dx[i], yK + dy[i]));
                queenPositions.add(new Point(xQ + dx[i], yQ + dy[i]));
            }

            int count = 0;
            for (Point p : kingPositions) {
                if (queenPositions.contains(p)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
