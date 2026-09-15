import java.util.Scanner;
public class Main {

    public static int logic(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        return logic(n/3) + logic(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(logic(n));
    }
}