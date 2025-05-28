import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int sum1 = 11 + 11*60 + 11*60*24;
        int sum2 = C + B*60 + A*60*24;

        if(sum1 > sum2) System.out.println(-1);
        else System.out.println(sum2-sum1);
    }
}