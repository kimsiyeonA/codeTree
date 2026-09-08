import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        int result = str.indexOf(c);

        System.out.print(result == -1 ? "No" : result);
    }
}