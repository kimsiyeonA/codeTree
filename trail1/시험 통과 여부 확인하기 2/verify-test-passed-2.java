import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < n; i++){
            int[] arr = new int[4];
            int sum = 0;

            for(int j = 0; j < 4; j++){
                arr[j] = sc.nextInt(); 
            }

            for(int j = 0; j < 4; j++){
                sum += arr[j];
            }

            if((sum / 4) >= 60){
                cnt++;
                System.out.println("pass");
            }else{
                System.out.println("fail");
            }
        }

        System.out.println(cnt);
    }
}