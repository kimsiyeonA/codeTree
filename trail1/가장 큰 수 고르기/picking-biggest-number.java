import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int [10];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;

        for(int i = 0; i < 10; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            //System.out.println(i + ":" +max + ", " + arr[i]);
        }
        
        System.out.println(max);
    }
}