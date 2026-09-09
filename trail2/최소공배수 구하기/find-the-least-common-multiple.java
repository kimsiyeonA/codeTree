import java.util.Scanner;

public class Main {
    
    public static void commonMultiple(int n, int m){
        int max = n*m;
        for(int i = 1; i <= max; i++){
            if(i % n == 0 && i % m == 0){
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        commonMultiple(n,m);
    }
}