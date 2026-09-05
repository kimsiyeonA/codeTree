import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int [4];

        for(int i = 0; i < 3; i++){
            char yn = sc.next().charAt(0);
            int n = sc.nextInt();

            if(yn == 'Y' && n >= 37){
                arr[0]++;
            }else if(yn == 'N' && n >= 37){
                arr[1]++;
            }else if(yn == 'Y'){
                arr[2]++;
            }else{
                arr[3]++;
            }
        }

        for(int i = 0; i < 4; i++){
            System.out.print(arr[i] + " ");
        }

        if(arr[0] >= 2){
            System.out.print('E');
        }
    }
}