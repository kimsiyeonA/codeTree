import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int d = n;
       int num =  0;

       for(int i = 1; i <= n ; i++){
            //System.out.println(i + ": " + d);
            d /= i;
            //System.out.println(i + ": " + d);
            if(d <= 1){
                num = i;
                break;
            }
        }

        System.out.println(num);
    }
}