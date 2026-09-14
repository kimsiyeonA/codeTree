import java.util.Scanner;

public class Main {
    public static int fio(int n){
        if(n == 1) return 1;
        if(n == 2) return 1;

        return fio(n-1) + fio(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(fio(n));
    }
}