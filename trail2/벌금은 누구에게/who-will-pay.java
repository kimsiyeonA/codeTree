import java.util.Scanner;

public class Main {

    public static int[] arr = new int [101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
       
        int[] penalizedPerson = new int[m];
        for (int i = 0; i < m; i++) {
            penalizedPerson[i] = sc.nextInt();
        }
        // Please write your code here.

        int idx = -1;

        for(int i = 0; i < m; i++){
            arr[penalizedPerson[i]]++;
            if(arr[penalizedPerson[i]] == k ){
                idx = penalizedPerson[i];
                break;
            }
        }

        System.out.println(idx);
    }
}