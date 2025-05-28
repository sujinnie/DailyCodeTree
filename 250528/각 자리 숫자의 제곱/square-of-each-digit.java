import java.util.Scanner;
public class Main {
    public static int F(int n) {
        if(n < 10) return n*n;
        int digit = n % 10;
        return (digit*digit) + F(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int ans = F(n);
        System.out.print(ans);
    }
}