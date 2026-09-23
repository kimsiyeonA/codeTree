import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.

        
        int[] digit = new int [30];
        int numA = 0;
        int idx = 0;

        for(int i = 0; i < N.length(); i++){
            numA = numA * A + (N.charAt(i) - '0');
        }

        while(numA > 0){
            digit[idx++] = numA % B;
            numA /= B;
        }

        for(int i = idx - 1; i >= 0; i--){
            System.out.print(digit[i]);
        }

        if(idx == 0 ) System.out.println(0);
        
    }
}