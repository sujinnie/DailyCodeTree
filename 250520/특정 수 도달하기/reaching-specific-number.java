import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        int cnt = 0;
        for (int num : arr) {
            if (num >= 250) {
                break;
            }
            sum += num;
            cnt++;
        }

        double avg = (double) sum / cnt;
        
        System.out.printf("%d %.1f", sum, avg);
    }
}
