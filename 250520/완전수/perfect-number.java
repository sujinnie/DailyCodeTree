import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt = 0;

        for (int i = start; i <= end; i++) {
            if(isComplete(i)) cnt++;
        }

        System.out.println(cnt);
    }

    private static boolean isComplete(int num) {
        int sum = 0;
        for(int i=1; i*i<=num; i++) {
            if(num%i == 0) {
                sum += i;
                if(num/i != i) {
                    sum += (num/i);
                }
            }
        }
        
        if(sum-num == num) return true;
        else return false;
    }
}
