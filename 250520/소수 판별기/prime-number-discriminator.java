import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)) System.out.println("P");
        else System.out.println("C");
    }
    
    private static boolean isPrime(int num) {
        if(num <= 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false; // 짝수제외
        for(int i=3; i*i <= num; i+=2) { // 홀수만 검사
            if(num%i == 0) return false;
        }
        return true;
    }
}
