import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 65;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i ; j++){
                System.out.print("  ");
            }
            for(int j = n - i; j > 0; j--){
                System.out.print((char)x++ + " ");
                if(x == 91) x = 65;
            }
            System.out.println();
        }
    }
}