import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cur = 1000;
        int[] visited = new int[2000];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            if(dir == 'R') {
                for(int j=cur; j < cur+x; j++) {
                    visited[j]++;
                }
                cur += x;
            }
            else {
                for(int j=cur-1; j >= cur-x; j--) {
                    visited[j]++;
                }
                cur -= x;
            }
        }

        int cnt = 0;
        for(int i=0; i<2000; i++) {
            if(visited[i] >= 2) cnt++;
        }

        System.out.println(cnt);
    }
}