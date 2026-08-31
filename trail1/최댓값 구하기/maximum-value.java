import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (max < b || max < c){
            if(b < c){
                max = c;
            }else {
                max = b;
            } 
        }

        System.out.println(max);
    }
}