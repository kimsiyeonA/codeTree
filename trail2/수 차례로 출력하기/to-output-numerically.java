import java.util.Scanner;
public class Main {
    public static void print1ton(int n){
        if(n == 0) return;

        print1ton(n -1);
        System.out.print(n + " ");
    }
    public static void printnto1(int n){
        if(n == 0) return;

        System.out.print(n + " ");
        printnto1(n -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        print1ton(n);
        System.out.println();
        printnto1(n);
    }
}