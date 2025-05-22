import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] str = new String[10];
        for(int i=0; i<10; i++) {
            str[i] = sc.next();
        }

        char target = sc.next().charAt(0);
        boolean flag = false;
        for(String s : str) {
            if(s.charAt(s.length()-1) == target) {
                System.out.println(s);
                flag = true;
            }
        }
        if(!flag) System.out.println("None");
    }
}