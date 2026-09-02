import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean yn = true; // 소수임

        for(int i = 2; i < n; i++){
            if(n%i == 0) yn = false; // 소수 아님
        }

        System.out.println(yn == true ? "P" : "C");
    }
}