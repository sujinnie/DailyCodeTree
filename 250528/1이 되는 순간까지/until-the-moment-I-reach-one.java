import java.util.Scanner;
public class Main {
    private static int F(int n, int cnt) {
        if(n == 1) return cnt;

        if(n%2 == 0) {
            n /= 2;
            cnt++;
            return F(n, cnt);
        }
        else {
            n /= 3;
            cnt++;
            return F(n, cnt); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int ans = F(n, 0);
        System.out.println(ans);
    }
}