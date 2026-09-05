import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int cnt = 0;

        for(int i = 0; ; i++){
            int num = sc.nextInt();
            if(num == 0) break;
            arr[i] = num;
            cnt++;
        }

        for(int i = 0; i < cnt; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] / 2 + " ");
            }else{
                System.out.print(arr[i] + 3 + " ");
            }
        }

    }
}