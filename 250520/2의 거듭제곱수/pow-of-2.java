import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int mul = 1;
        while(mul != n){
            mul *= 2;
            x++;
        }
        System.out.println(x);
    }
}