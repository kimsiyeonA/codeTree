import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.
        char[] word1Arr = word1.toCharArray();
        char[] word2Arr = word2.toCharArray();
        Arrays.sort(word1Arr);
        Arrays.sort(word2Arr);
        String newWord1 = new String(word1Arr);
        String newWord2 = new String(word2Arr);

        if(newWord1.equals(newWord2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}