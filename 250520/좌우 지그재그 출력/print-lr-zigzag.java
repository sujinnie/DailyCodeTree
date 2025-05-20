import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            if(i%2 == 0) {
                int cnt1 = n*i + 1;
                for(int j=0; j<n; j++) {
                    System.out.print(cnt1+" ");
                    cnt1++;
                }
            }
            else {
                int cnt2 = n*(i+1);
                for(int j=n; j>0; j--) {
                    System.out.print(cnt2+" ");
                    cnt2--;
                }
            }
            System.out.println();
        }
    }
}