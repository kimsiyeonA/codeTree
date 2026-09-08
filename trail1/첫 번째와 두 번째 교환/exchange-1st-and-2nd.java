import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] fixArr = str.toCharArray();
        char[] changeArr = str.toCharArray();
        
        char c = fixArr[0];

        for(int j = 0; j < str.length(); j++){
            if(fixArr[j] == c){
                changeArr[j] = fixArr[1];
            }
        }

        c = fixArr[1];

        for(int j = 0; j < str.length(); j++){
            if(fixArr[j] == c){
                changeArr[j] = fixArr[0];
            }
        }

        System.out.println(String.valueOf(changeArr));
      
    }
}