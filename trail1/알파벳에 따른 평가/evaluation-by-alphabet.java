import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char n = sc.next().charAt(0);

        if (n == 'S') {
            System.out.println("Superior");
        } else if (n == 'A') {
            System.out.println("Excellent");
        } else if (n == 'B') {
            System.out.println("Good");
        } else if (n == 'C') {
            System.out.println("Usually");
        } else if (n == 'D') {
            System.out.println("Effort");
        } else {
            System.out.println("Failure");
        }
    }
}