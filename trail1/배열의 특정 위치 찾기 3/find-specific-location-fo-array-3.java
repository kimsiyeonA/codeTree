import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[200];
        int sum = 0, cnt = 0;

        for(int i = 0; ; i++){
            int num = sc.nextInt();
            if(num == 0) break;
            arr[i] = num;
            cnt++;
        }

        for(int i = cnt-1; i >= cnt-3; i--){
            sum += arr[i];
        }

        System.out.println(sum);

    }
}