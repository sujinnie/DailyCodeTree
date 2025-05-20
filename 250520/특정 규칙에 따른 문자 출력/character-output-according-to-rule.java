import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 1) 위쪽: 1개부터 N개까지
        for (int i = 1; i <= N; i++) {
            // (N–i)개의 공백으로 왼쪽 여백
            for (int s = 0; s < N - i; s++) {
                System.out.print("  ");
            }
            // i개의 '@'을 찍되, 사이사이는 공백
            for (int j = 0; j < i; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }

        // 2) 아래쪽: N-1개부터 1개까지
        for (int i = N - 1; i >= 1; i--) {
            // i개의 '@'
            for (int j = 0; j < i; j++) {
                System.out.print("@ ");
            }
            // 다시 (N–i)개의 공백
            for (int s = 0; s < N - i; s++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
