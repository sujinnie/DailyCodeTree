import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = "";
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            str += String.valueOf(sc.nextInt()); 
        }
        
        for(int i=1; i<=str.length(); i++) {
            System.out.print(str.charAt(i-1));
            if(i%5 == 0) System.out.println();
        }
    }
}