import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n; i>0; i--) {
            for(int j=1; j<=i; j++) {
                for(int k=1; k<=i; k++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}