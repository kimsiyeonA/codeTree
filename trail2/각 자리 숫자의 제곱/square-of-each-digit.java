import java.util.Scanner;
public class Main {
    public static int mul(int n){
        if(n == 0) return 0;
        int nn = n % 10;
        nn *= nn;
        n /= 10;
    
        return mul(n) + nn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(mul(n));
    }
}