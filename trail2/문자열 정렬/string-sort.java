import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        char[] carr = s.toCharArray();
        Arrays.sort(carr);
        String sorts = new String(carr);
        System.out.println(sorts); 
    }
}