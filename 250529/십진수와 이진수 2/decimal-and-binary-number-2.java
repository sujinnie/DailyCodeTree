import java.util.Scanner;
public class Main {
    public static String toBinary(int n) {
        int cnt = 0;
        int[] digit = new int[20];

        while(true) {
            if(n < 2) {
                digit[cnt++] = n;
                break;
            }

            digit[cnt++] = n%2;
            n /= 2;
        }

        String binaryNum = "";
        for(int i=cnt-1; i>=0; i--) {
            binaryNum += digit[i];
        }

        return binaryNum;
    }

    public static int toDecimal(String binaryNum) {
        int len = binaryNum.length();
        int[] digit = new int[len];
        for(int i=0; i<len; i++) {
            digit[i] = binaryNum.charAt(i) - '0';
        }

        int num = 0;
        for(int i=0; i<len; i++) {
            num  = num*2 + digit[i];
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        
        int decimalNum = toDecimal(binary);
        String ans = toBinary(decimalNum*17);

        System.out.println(ans);
    }
}