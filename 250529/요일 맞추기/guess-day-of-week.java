import java.util.Scanner;
public class Main {
    static String[] dayOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    static int[] numOfDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public static int cntDaysOfYear(int m, int d) {
        int sum = 0;
        for(int i=1; i<m; i++) {
            sum += numOfDays[i];
        }
        return sum + d;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        int sum1 = cntDaysOfYear(m1, d1);
        int sum2 = cntDaysOfYear(m2, d2);
        
        int yoil = (sum2 - sum1) % 7;
        if(yoil < 0) yoil += 7;
        
        System.out.println(dayOfWeek[yoil]);
    }
}