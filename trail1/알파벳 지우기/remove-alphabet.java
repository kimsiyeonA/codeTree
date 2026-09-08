import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(change(str1)+change(str2));
    }

    public static int change(String value){
        String str = "";
        for(int i = 0; i < value.length(); i++){
            char c = value.charAt(i);
            if('0' <= c && c <= '9'){
                str += c;
            }
        }
        return Integer.parseInt(str);
    }
}