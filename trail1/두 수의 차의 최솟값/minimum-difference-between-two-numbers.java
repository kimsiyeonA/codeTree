import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int [n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int num = arr[i]-arr[j];
                if(num < 0) num *= -1;
                if(num < min) min = num; 
            }
        }

        System.out.println(min);
    }
}