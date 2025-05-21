import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] countArr = new int[b];

        while(a > 1) {
            int r = a%b;
            a /= b;
            countArr[r]++;
        }

        int sum = 0;
        for (int i = 0; i < countArr.length; i++) {
            if(countArr[i] != 0) sum += (countArr[i]*countArr[i]);
        }
        System.out.print(sum);
    }
}
