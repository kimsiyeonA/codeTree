import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[10];
        for(int i = 0; i < 10; i++){
            str[i] = sc.next();
        }

        char c = sc.next().charAt(0);
        boolean have = false;

        for(int i = 0; i < str.length; i++){
            if(str[i].charAt(str[i].length()-1) == c){
                System.out.println(str[i]);
                have = true;
            }
        }

        if(have == false){
            System.out.println("None");
        }
    }
}