import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int [n];
        int idx = -1, cnt = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(cnt == 3) break;
            if(arr[i] == 2){
                idx = i;
                cnt++;
            }
        }

        System.out.println(idx+1);

    }
}