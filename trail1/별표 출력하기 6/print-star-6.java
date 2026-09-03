import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n ; i++){
            //System.out.print(i);
            for(int j = i; j > 0; j-- ){
                System.out.print("  "); // 공백
            }
            for(int j = 0; j < (n+(n-1))-(2*i); j++){
                //System.out.print(j );
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < n-1 ; i++){
            //System.out.print(i);
            for(int j = n-(i+2); j > 0; j-- ){
                System.out.print("  "); // 공백
            }
            for(int j = 0; j < 3 +(2*i); j++){
                //System.out.print(j );
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}