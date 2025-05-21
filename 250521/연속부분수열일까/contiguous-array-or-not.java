import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int[] a = new int[n1];
        int[] b = new int[n2];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n1; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n2; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i+n2<=n1; i++) {
            int cnt = 0;
            for(int j=0; j<n2; j++){
                if(a[i+j] == b[j]) {
                    cnt++;
                }
            }
            if(cnt == n2) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}