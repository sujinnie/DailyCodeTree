import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0, cnt = 0;
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            String str = sc.next();
            
            int len = str.length();
            sum += len;

            if(str.charAt(0) == 'a') cnt++;
        }
        
        System.out.println(sum + " " + cnt);
    }
}