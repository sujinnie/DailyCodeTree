import java.util.*;

public class Main {
    public static class Distance implements Comparable<Distance>{
        int d;
        int num;

        public Distance(int num, int d) {
            this.num = num;
            this.d = d;
        }

        @Override
        public int compareTo(Distance other) {
            if(this.d == other.d) {
                return this.num - other.num;
            }
            return this.d - other.d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Distance[] dist = new Distance[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int d = Math.abs(x) + Math.abs(y);
            dist[i] = new Distance(i+1, d);
        }

        Arrays.sort(dist);
        for(int i=0; i<n; i++) {
            System.out.println(dist[i].num);
        }
    }
}