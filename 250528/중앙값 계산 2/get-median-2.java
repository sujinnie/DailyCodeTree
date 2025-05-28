import java.util.*;

public class Main {
    private static void getMidVal(int[] arr, int n) {
        Arrays.sort(arr, 1, n+1);
        int midIdx = n/2 + 1;
        System.out.print(arr[midIdx] + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            if(i % 2 != 0) {
                getMidVal(arr, i);
            }
        }
    }
}