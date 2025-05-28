import java.util.Scanner;
public class Main {
    private static int f(int n) {
        if(n == 1) return 2;
        if(n == 2) return 4;
        return (f(n-1)*f(n-2)) % 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int ans = f(n);
        System.out.println(ans);
    }
}