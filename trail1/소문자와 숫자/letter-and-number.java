import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if('A' <= c && c <= 'Z'){
                System.out.print((char)((int)c+32));
            }else if(('a' <= c && c <= 'z')||('0' <= c && c <= '9')){
                System.out.print(c);
            }
        }
    }
}