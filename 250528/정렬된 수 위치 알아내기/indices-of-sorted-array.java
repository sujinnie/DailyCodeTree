import java.util.*;

public class Main {
    public static class Info implements Comparable<Info>{
        int idx, num;
        public Info(int num, int idx) {
            this.idx = idx;
            this.num = num;
        }

        @Override
        public int compareTo(Info other) {
            if(this.num != other.num) {
                return this.num - other.num;
            }
            return this.idx - other.idx;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Info[] arr = new Info[n];
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            arr[i] = new Info(num, i);
        }

        Arrays.sort(arr);

        int[] ans = new int[n];
        for(int i=0; i<n; i++) {
            ans[arr[i].idx] = i+1;
        }

        for(int i=0; i<n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}