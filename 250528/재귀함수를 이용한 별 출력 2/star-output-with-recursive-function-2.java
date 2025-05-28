import java.util.Scanner;
public class Main {
    private static void printStar(int n) {
        if(n == 0) return;

        for(int i=n; i>0; i--) {
            System.out.print("* ");
        }
        System.out.println();

        printStar(n-1);
        
        for(int i=n; i>0; i--) {
            System.out.print("* ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printStar(n);
    }
}