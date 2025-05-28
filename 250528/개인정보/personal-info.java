import java.util.*;

public class Main {
    public static class Info {
        String name;
        int height;
        double weight;

        public Info(String name, int height, double weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        Info[] infos = new Info[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            infos[i] = new Info(name, height, weight);
        }
        
        Arrays.sort(infos, (a, b) -> a.name.compareTo(b.name));
        System.out.println("name");
        for(int i=0; i<n; i++) {
            System.out.printf("%s %d %.1f \n", infos[i].name, infos[i].height, infos[i].weight);
        }

        System.out.println();

        Arrays.sort(infos, (a, b) -> b.height - a.height);
        System.out.println("height");
        for(int i=0; i<n; i++) {
            System.out.printf("%s %d %.1f \n", infos[i].name, infos[i].height, infos[i].weight);
        }
    }
}