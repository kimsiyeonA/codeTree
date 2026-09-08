import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        int sum = (int)a + (int)b;
        int minus = (int)a > (int)b ? (int)a - (int)b : (int)b - (int)a ;

        System.out.print(sum + " " + minus);
    }
}