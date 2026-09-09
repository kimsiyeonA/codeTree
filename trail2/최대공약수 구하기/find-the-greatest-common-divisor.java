import java.util.Scanner;

public class Main {

    public static void commonDivisor(int n, int m){
        int num = n < m ? n : m;
        int result = 1;
        for(int i = 1; i <= num; i++){
            if(n % i == 0 && m % i == 0 ){
                result = i;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        commonDivisor(n,m);
    }
}