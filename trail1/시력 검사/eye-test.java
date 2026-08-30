import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double right = sc.nextDouble();
        double left = sc.nextDouble();

        if (right >= 1.0 && left >= 1.0){
            System.out.println("High");
        } else if (right >= 0.5 && left >= 0.5){
            System.out.println("Middle");
        } else {
            System.out.println("Low");
        }
    }
}