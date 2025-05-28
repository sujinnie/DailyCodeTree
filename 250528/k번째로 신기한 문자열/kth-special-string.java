import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();

        List<String> list = new ArrayList<>();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
            if(words[i].startsWith(t)) {
                list.add(words[i]);
            }
        }
        
        Collections.sort(list);
        System.out.println(list.get(k-1));
    }
}