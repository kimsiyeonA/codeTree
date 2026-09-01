import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String result = "";

        result = result +  (a / b) ;

        a = (a % b) * 10 ;

        result = result + "." + (a / b) ;

        for(int i = 0; i < 19; i++){
            a = (a % b) * 10 ;
            result = result + (a / b) ;
        }
        
        System.out.println(result);

    }
}