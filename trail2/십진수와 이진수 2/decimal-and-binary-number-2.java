import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        
        int[] digit = new int [20];
        int num10 = 0;
        int idx = 0;

        for(int i = 0; i < binary.length(); i++){
            num10 = num10*2+(binary.charAt(i) - '0');
        }

        num10 *= 17;

        while(num10 > 0){
            digit[idx++] = num10 % 2;
            num10 /= 2;
        }

        for(int i = idx - 1; i >= 0; i--){
            System.out.print(digit[i]);
        }


        
    
    }
}