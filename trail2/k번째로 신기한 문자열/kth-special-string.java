import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        Arrays.sort(words);

        int index = 0;

        for(int i = 0; i < words.length; i++){
            if(words[i].length() < t.length()) continue;
            String str = words[i].substring(0,t.length());
            //System.out.println(str + "..." + t + "..." + str.equals(t));
            if(str.equals(t)) {
                index = i;
                break;
            }
        }

        System.out.println(words[index+k-1]);
    }
}