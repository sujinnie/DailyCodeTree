import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int sum = a+b+c+d;
            double avg = (double) sum / 4;
            if(avg >= 60.0) {
                cnt++;
                System.out.println("pass");
            }
            else {
                System.out.println("fail");
            }
        }
        System.out.println(cnt);
    }
}