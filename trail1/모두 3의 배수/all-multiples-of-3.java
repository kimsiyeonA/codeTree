import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean yn = true; // 3의 배수 있음

        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();

            if(num % 3 != 0) yn = false;
        }

        System.out.println(yn == true? 1 : 0);
    }
}