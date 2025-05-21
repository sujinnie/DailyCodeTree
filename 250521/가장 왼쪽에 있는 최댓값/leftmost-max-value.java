import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int minIdx = n;
        while(minIdx != 0){ 
            int maxNum = 0;
            int found = 0;
            for(int i=0; i<minIdx; i++) {
                // System.out.println("i: "+ i);
                // System.out.println("minIdx: "+ minIdx);
                if(arr[i] > maxNum) {
                    maxNum = arr[i];
                    found = i+1;
                    // System.out.println("maxNum: "+ maxNum);
                    // System.out.println("found: "+ found);
                }
            }
            minIdx = found-1;
            System.out.print(found + " ");
        }
    }
}