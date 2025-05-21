import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // if(n == 1) {
        //     System.out.println(arr[0]);
        //     return;
        // }

        int minPrice = arr[0];
        int maxPrice = 0;
        int diff = 0;
        for(int i=1; i<n; i++) {
            if(minPrice < arr[i]) {
                maxPrice = arr[i];
                diff = maxPrice - minPrice;
            }
            else {
                minPrice = arr[i];
            }
        }
        System.out.println(diff);
    }
}