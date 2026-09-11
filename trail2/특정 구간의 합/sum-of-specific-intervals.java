import java.util.Scanner;
public class Main {
    public static int[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            int sum = 0;
            for(int j = a1-1; j <= a2-1; j++){
                sum += A[j];
            }
            System.out.println(sum);
        }
    }
}