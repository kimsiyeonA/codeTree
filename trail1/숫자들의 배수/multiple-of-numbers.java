import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10]; 
        int n = sc.nextInt();
        int maxcnt = 0, idxcnt = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = n * (i + 1);
            idxcnt++;
            if(arr[i] % 5 == 0 ) maxcnt++;
            if(maxcnt == 2) break;
        }

        for(int i = 0; i < idxcnt; i++){
            System.out.print(arr[i] + " ");
        }
    }
}