import java.util.Scanner;
public class Main {
    private static int f(int n) {
        if(n < 10) return n;
        return n%10 + f(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int ans = f(a*b*c);
        System.out.println(ans);
    }
}