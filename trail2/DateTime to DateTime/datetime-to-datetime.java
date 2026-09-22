import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.

        int result = countDateTime(A, B, C);
        if (result == -1) {
            System.out.println(result);
        } else {
            System.out.println(result - countDateTime(11, 11, 11));
        }
    }

    public static int countDateTime(int d, int h, int m) {
        if (d < 11) return -1;
        else if (d == 11 && h < 11) return -1;
        else if (d == 11 && h == 11 && m < 11) return -1;
        return ((d * 24) + h) * 60 + m;
    }
}
