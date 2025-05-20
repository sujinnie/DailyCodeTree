import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int lcm = (n*m) / gcd(n, m);
        System.out.println(lcm);
    }
    private static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}