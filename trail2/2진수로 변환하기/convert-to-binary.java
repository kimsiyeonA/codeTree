import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        int[] digit = new int [20];
        int idx = 0;

        while(n > 0){
            digit[idx++] = n % 2;
            n /= 2;
        }

        for(int i = idx - 1; i >= 0; i--){
            System.out.print(digit[i]);
        }
        if(idx == 0) System.out.print(0);
    }
}
