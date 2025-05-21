import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<q; i++) {
            int type = sc.nextInt();
            if(type == 1) {
                int a = sc.nextInt();
                System.out.println(arr[a-1]);
            }
            else if(type == 2) {
                int b = sc.nextInt();
                int idx = q2(arr, b);
                System.out.println(idx);
            }
            else{
                int s = sc.nextInt();
                int e = sc.nextInt();
                for(int j=s; j<=e; j++) {
                    System.out.print(arr[j-1] + " ");
                }
                System.out.println();
            }
        }
    }
    
    private static int q2(int[] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) return i+1;
        }
        return 0;
    }
}
