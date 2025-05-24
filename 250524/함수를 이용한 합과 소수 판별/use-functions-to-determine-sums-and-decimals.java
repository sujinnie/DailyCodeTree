import java.util.Scanner;
public class Main {
    private static boolean isPrime(int num) {
        if(num < 2) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;
        for(int i=3; i*i<=num; i+=2) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isEven(int num) {
        int sum = 0;
        while(num > 0) {
            int digit = num%10;
            num /= 10;

            sum += digit;
        }
        
        if(sum % 2 == 0) return true;
        else return false;
    }

    private static boolean isValid(int num) {
        if(isPrime(num) && isEven(num)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for(int i = a; i<=b; i++) {
            if(isValid(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}