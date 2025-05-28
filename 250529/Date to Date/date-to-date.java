import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int sum1 = 0, sum2 = 0;
        for(int i=1; i<m1; i++) {
            sum1 += num_of_days[i];
        }
        sum1 += d1;

        for(int i=1; i<m2; i++) {
            sum2 += num_of_days[i];
        }
        sum2 += d2;

        System.out.println(sum2 - sum1 + 1);
    }
}