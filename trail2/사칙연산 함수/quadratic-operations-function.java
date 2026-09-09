import java.util.Scanner;
public class Main {

    public static int add(int a, int b){
        return a + b;
    }
    public static int miu(int a, int b){
        return a - b;
    }
    public static int div(int a, int b){
        return a / b;
    }
    public static int mul(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.

        if(o == '+') System.out.printf("%d + %d = %d", a, c, add(a,c));
        else if(o == '-') System.out.printf("%d - %d = %d", a, c, miu(a,c));
        else if(o == '/') System.out.printf("%d / %d = %d", a, c, div(a,c));
        else if(o == '*') System.out.printf("%d * %d = %d", a, c, mul(a,c));
        else System.out.print("False");
    }
}