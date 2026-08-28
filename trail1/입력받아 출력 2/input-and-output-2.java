import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        String[] strArr = id.split("-");
        System.out.println(strArr[0] + strArr[1]);
    }
}