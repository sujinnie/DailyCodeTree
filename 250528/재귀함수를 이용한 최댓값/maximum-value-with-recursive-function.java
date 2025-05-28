import java.util.Scanner;
public class Main {
    private static int findMax(int[] arr, int idx, int max) {
        if(idx == arr.length) return max;

        if(arr[idx] > max) {
            return findMax(arr, idx+1, arr[idx]);
        }
        else {
            return findMax(arr, idx+1, max);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int ans = findMax(arr, 0, arr[0]);
        System.out.println(ans);
    }
}