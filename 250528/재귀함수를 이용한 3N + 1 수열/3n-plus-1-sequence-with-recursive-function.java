import java.util.Scanner;
public class Main {
    private static int f(int n, int cnt) {
        if(n <= 1) return cnt;

        if(n%2 == 0) {
            n /= 2; 
            cnt++;
            return f(n, cnt);
        } 
        else {
            n = n*3 + 1;
            cnt++;
            return f(n, cnt);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int ans = f(n, 0);
        System.out.println(ans);
    }
}