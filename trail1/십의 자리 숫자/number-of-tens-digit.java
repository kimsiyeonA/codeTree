import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for(int i = 0;  ; i++){
            int num = sc.nextInt();
            if(num == 0) break;
            num /= 10;
            arr[num]++;
        }
        for(int i = 1; i <= 9; i++){
            System.out.println(i + " - " + arr[i]);
        }
    }
}