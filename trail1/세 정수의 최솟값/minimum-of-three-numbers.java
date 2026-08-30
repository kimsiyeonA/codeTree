import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = a;

        if (min >= b && b <= c){
            min = b;
        } else if (min >= c && c <= b){
            min = c;
        }

        System.out.println(min);
    }
}