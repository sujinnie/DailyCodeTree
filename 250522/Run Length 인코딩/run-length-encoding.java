import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();

        int cnt = 1;
        char prev = A.charAt(0);
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<A.length(); i++) {
            char cur = A.charAt(i);

            if(prev == cur) {
                cnt++;
            }
            else {
                sb.append(prev).append(cnt);
                cnt = 1;
                prev = cur;
            }
        }
        sb.append(prev).append(cnt);

        System.out.println(sb.length());
        System.out.println(sb.toString());
    }
}