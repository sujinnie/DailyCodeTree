import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int num = 1;
        int[][] arr = new int[n][m];
        int s = n+m-2; // 대각선 (i,j) 합..
        for(int k = 0; k<=s; k++) {
            for(int i=0; i<n; i++) {
                int j = k-i;
                if(0<=j && j<m) {
                    arr[i][j] = num;
                    num++;
                } 
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}