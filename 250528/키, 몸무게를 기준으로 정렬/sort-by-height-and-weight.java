import java.util.*;

public class Main {
    public static class Info implements Comparable<Info> {
        String name;
        int height;
        int weight;

        public Info(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Info other) {
            if(this.height == other.height) {
                return other.weight - this.weight;
            }
            return this.height - other.height;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Info[] infos = new Info[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            infos[i] = new Info(name, height, weight);
        }

        Arrays.sort(infos);
        for(int i=0; i<n; i++) {
            System.out.printf("%s %d %d \n", infos[i].name, infos[i].height, infos[i].weight);
        }
    }
}