import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int idx = 0;
        for(int i=0; i<10; i++) {
            int n = sc.nextInt();
            if(n == 0) break;
            arr[i] = n;
            idx = i;
        }

        for(int i=idx; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}