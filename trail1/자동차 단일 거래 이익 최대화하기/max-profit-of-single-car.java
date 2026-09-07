import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = 0;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] > arr[j]) continue;
                if(arr[i] - arr[j] < min){
                    min = arr[i] - arr[j];
                }
            }
        }

        if(min >= 0){
            System.out.println(0);
        }else{
            System.out.println(min*-1);
        }
    }
}