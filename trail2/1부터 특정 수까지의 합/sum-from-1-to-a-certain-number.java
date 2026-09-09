import java.util.Scanner;
public class Main {

    public static int sum10div(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        //System.out.println(sum);
        return sum/10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(sum10div(n));
    }
}