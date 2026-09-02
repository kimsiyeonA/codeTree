import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n ; i++){
            for(int z = n - i; z > 0; z--){
                for(int j = n - i; j > 0; j--){
                   System.out.print("*"); 
                } 
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}