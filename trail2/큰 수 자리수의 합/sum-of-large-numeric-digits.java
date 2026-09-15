import java.util.Scanner;
public class Main {
    public static int sum(int n){
        if(n == 0) return 0;

        int num = n % 10;
        n /= 10;

        return sum(n) + num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        System.out.println(sum(a*b*c));
    }
}