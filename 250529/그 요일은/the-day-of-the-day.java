import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        
        String[] day_of_week = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int mon = m1, day = d1, yoil = 0, cnt = 1;
        while(true) {
            if(mon == m2 && day == d2) {
                System.out.println(cnt);
                break;
            }

            yoil = (yoil+1) % 7;
            if(day_of_week[yoil].equals(A)) {
                cnt++;
            }

            day++;
            if(day > num_of_days[mon]) {
                day = 1;
                mon++;
                if (mon > 12) {
                    mon = 1; 
                }
            }
        }
    }
}