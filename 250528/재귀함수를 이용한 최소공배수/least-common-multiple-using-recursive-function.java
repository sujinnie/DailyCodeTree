import java.util.Scanner;

public class Main {
    private static int lcmArray(int[] arr, int idx) {
        if(idx == arr.length - 1) {
            return arr[idx];
        }
        int restLcm = lcmArray(arr, idx+1);
        return lcm(arr[idx], restLcm);
    }

    private static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    private static int lcm(int a, int b) {
        int g = gcd(a, b);
        return (a/g)*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int ans = lcmArray(arr, 0);
        System.out.println(ans);
    }
}