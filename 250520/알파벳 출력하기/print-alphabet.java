import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 65;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                if(x == 91) x = 65;
                System.out.print((char)x);
                x++;
            }
            System.out.println();
        }
    }
}