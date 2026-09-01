import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0, sum = 0;

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            sum += num;
            cnt++;
        }

        System.out.printf("%d %.1f", sum, (double)sum/cnt);
    }
}