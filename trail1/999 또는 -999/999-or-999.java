import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int [100];
        final int MAX = Integer.MAX_VALUE;
        final int MIN = Integer.MIN_VALUE;
        int min_result = MAX;
        int max_result = MIN;
        int cnt = 0;

        for(int i = 0; i < 100; i++){
            int num = sc.nextInt();
            if(num == 999 || num == -999 ) break;
            arr[i] = num;
            cnt++;
        }

        for(int i = 0; i < cnt; i++){
            if(max_result < arr[i]){
                max_result = arr[i];
            }
        }

        for(int i = 0; i < cnt; i++){
            if(min_result > arr[i]){
                min_result = arr[i];
            }
        }

        System.out.println(max_result + " " + min_result);

    }
}