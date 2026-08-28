import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.next();
        String[] strArr = day.split("-");

        System.out.println(strArr[2] + "." + strArr[0] + "." + strArr[1]);
    }
}