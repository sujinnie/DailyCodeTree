import java.util.*;

public class Main {
    static class Info implements Comparable<Info>{
        String name;
        String address;
        String city;

        public Info(String name, String address, String city) {
            this.name = name;
            this.address = address;
            this.city = city;
        }

        @Override
        public int compareTo(Info other) {
            return other.name.compareTo(this.name);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Info[] infoList = new Info[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String city = sc.next();
            infoList[i] = new Info(name, address, city);
        }
        
        Arrays.sort(infoList);

        System.out.println("name " + infoList[0].name);
        System.out.println("addr " + infoList[0].address);
        System.out.println("city " + infoList[0].city);
    }
}