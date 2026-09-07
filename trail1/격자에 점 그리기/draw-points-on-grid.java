import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = 1;

        int[][] arr = new int [n+1][n+1];

        for(int i = 0; i < m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();

            arr[r][c] = num++;
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}