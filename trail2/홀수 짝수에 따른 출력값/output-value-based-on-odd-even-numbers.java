import java.util.Scanner;

public class Main {
    public static int sum(int n){
        if(1==n) return 1;
        if(2==n) return 2;
        return n+sum(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(sum(n));
    }
}