import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int len = s.length();
        int q = sc.nextInt();
        for(int i=0; i<q; i++) {
            int type = sc.nextInt();
            if(type == 1) {
                s = s.substring(1) + s.substring(0,1);
                System.out.println(s);
            }
            else if(type == 2) {
                s = s.substring(len-1) + s.substring(0,len-1);
                System.out.println(s);
            }
            else {
                String reversed = "";
                for(int k=len-1; k>=0; k--) {
                    reversed += s.charAt(k);
                }
                s = reversed;
                System.out.println(s);
            }
        }
    }
}