import java.util.Scanner;

public class Main {
    private static int f(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        return n + f(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int ans = f(n);
        System.out.println(ans);
    }
}