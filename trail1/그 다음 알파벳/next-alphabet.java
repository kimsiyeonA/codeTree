import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        if(c == 'z') c = 'a';
        else c += 1;

        System.out.println(c);
    }
}