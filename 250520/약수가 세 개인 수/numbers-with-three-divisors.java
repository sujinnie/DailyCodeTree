import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt = 0;

        for (int i = start; i <= end; i++) {
            if(cntFactor(i) == 3) cnt++;
        }

        System.out.println(cnt);
    }

    private static int cntFactor(int num) {
        int cnt = 0;
        
        for(int i=1; i*i<=num; i++) {
            if(num%i == 0) {
                cnt++;
                if(num/i != i) {
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}
