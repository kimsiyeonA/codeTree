import java.util.Scanner;
public class Main {

    public static int cnt ;
    public static void cntMake(int n){
        if(n == 1) return;

        if(n % 2 == 0){
            n /=2;
        }else{
            n = n * 3 + 1;
        }

        cnt++;
        cntMake(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        cntMake(n);
        System.out.println(cnt);
    }
}