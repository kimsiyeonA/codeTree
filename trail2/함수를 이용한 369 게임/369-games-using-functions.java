import java.util.Scanner;
public class Main {

    public static boolean is369(int n){
        return (n%3==0) || isHave369(n);
    }

    public static boolean isHave369(int n){
        while(n > 0){
            int num = n % 10;
            n /= 10;
            if(num == 3||num == 6|| num == 9) return true;
        }
        return false; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        int cnt = 0;
        for(int i = A; i <= B; i++){
            if(is369(i)) cnt++;
        }
        System.out.println(cnt);
    }
}