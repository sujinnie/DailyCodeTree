import java.util.Scanner;
public class Main {
    static int n1, n2;

    private static boolean isValid(int[] a, int[] b) {
        if(n2 > n1) return false;
        
        for(int i=0; i<=n1-n2; i++) {
            boolean match = true;
            for(int j=0; j<n2; j++) {
                if(a[i+j] != b[j]) {
                    match = false;
                    break;
                }
            }
            if(match) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.
        if(isValid(a,b)) System.out.println("Yes");
        else System.out.println("No");
    }
}