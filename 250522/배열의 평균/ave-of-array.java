import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];

        int totalSum = 0;
        
        for(int i=0; i<2; i++) {
            int rowSum = 0;
            for(int j=0; j<4; j++) {
                arr[i][j] = sc.nextInt();
                rowSum += arr[i][j];
            }
            System.out.printf("%.1f ", (double) rowSum/4);
            totalSum += rowSum;
        }

        System.out.println();

        for(int j=0; j<4; j++) {
            int colSum = 0;
            for(int i=0; i<2; i++) {
                colSum += arr[i][j];
            }
            System.out.printf("%.1f ", (double)colSum/2);
        }

        System.out.println();

        double avg = (double) totalSum/8;
        System.out.printf("%.1f ", avg);
    }
}