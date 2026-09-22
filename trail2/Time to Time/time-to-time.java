import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.

        int runtime = 0;

        while(true){
            if(a == c && b == d) break;

            b++;
            runtime++;

            if(b == 60){
                a++;
                b = 0;
            }

        }
        
        System.out.println(runtime);
    }
}