import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int num = 1;
        boolean bottomUp = true;
        int[][] arr = new int[n][n];
        for(int j=n-1; j>=0; j--) {
            if(bottomUp) {
                for(int i=n-1; i>=0; i--) {
                    arr[i][j] = num;
                    num++;
                }
            } 
            else {
                for(int i=0; i<n; i++) {
                    arr[i][j] = num;
                    num++;
                }
            }
            bottomUp = !bottomUp;
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}