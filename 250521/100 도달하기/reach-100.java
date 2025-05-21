import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int a = 1;
        int b = N;

        System.out.print(a + " " + b);

        while (true) {
            int c = a + b;        // 새로 만들 다음 항
            System.out.print(" " + c);
            if (c > 100) break;   // 100 초과하면 멈춤

            // 한 칸씩 앞으로 당기기
            a = b;
            b = c;
        }
    }
}
