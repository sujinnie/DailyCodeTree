import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++) {
            str[i] = sc.next();
        }

        char target = sc.next().charAt(0);
        int cnt = 0, sum = 0;
        for(String s : str) {
            if(s.charAt(0) == target) {
                cnt++;
                sum += s.length();
            }
        }

        double avg = (double) sum / cnt;
        System.out.printf("%d %.2f", cnt, avg);
    }
}