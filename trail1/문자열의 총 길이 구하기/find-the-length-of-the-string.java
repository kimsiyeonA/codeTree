import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[10];
        String sentens = "";

        for(int i = 0; i < 10; i++){
            str[i] = sc.next();
        }

        for(int i = 0; i < 10; i++){
            sentens += str[i];
        }

        System.out.println(sentens.length());
    }
}