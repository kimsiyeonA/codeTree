import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0, cnt = 0;

        for(int i = 0; i < 10; i++){
            int num = sc.nextInt();
            if(num == 0) break;
            arr[i] = num;
            cnt++;
        }

        for(int i = 0; i < cnt; i++){
            sum += arr[i];
        }

        System.out.printf("%d %.1f", sum, sum/(double)cnt);

    }
}