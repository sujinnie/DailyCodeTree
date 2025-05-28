import java.util.Scanner;
public class Main {
    public static String decimalToN(int num, int n) {
        int cnt = 0;
        int[] digit = new int[20];

        while(true) {
            if(num < n) {
                digit[cnt++] = num;
                break;
            }

            digit[cnt++] = num%n;
            num /= n;
        }

        String nNum = "";
        for(int i=cnt-1; i>=0; i--) {
            nNum += digit[i];
        }

        return nNum;
    }

    public static int nToDecimal(String num, int n) {
        int len = num.length();
        int[] digit = new int[len];
        for(int i=0; i<len; i++) {
            digit[i] = num.charAt(i) - '0';
        }

        int decimalNum = 0;
        for(int i=0; i<len; i++) {
            decimalNum  = decimalNum*n + digit[i];
        }

        return decimalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        int decimalNum = nToDecimal(N, A);
        String ans = decimalToN(decimalNum, B);
        System.out.println(ans);
    }
}