import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        char[] cBinary = binary.toCharArray();
        int num = 0;
        for(int i = 0; i < cBinary.length ; i++){
            num = num * 2 + cBinary[i] - 48;
            //System.out.println("for in" + num + "..." + (cBinary[i] - 48));
        }
        System.out.println(num);
    }
}