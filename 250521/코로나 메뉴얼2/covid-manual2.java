import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] isSick = new char[3];
        int[] temp = new int[3];
        int[] countArr = new int[4];

        for (int i = 0; i < 3; i++) {
            isSick[i] = sc.next().charAt(0);
            temp[i] = sc.nextInt();
            
            if(isSick[i] == 'Y' && temp[i] >= 37) countArr[0]++;
            else if(isSick[i] == 'N' && temp[i] >= 37) countArr[1]++;
            else if(isSick[i] == 'Y' && temp[i] < 37) countArr[2]++;
            else countArr[3]++;
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(countArr[i]+ " ");
        }
        if(countArr[0] >= 2) System.out.print("E");
    }
}
