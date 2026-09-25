import java.util.Scanner;
public class Main {
    public static int OFFSET = 100;
    public static int SIZE = OFFSET * 2 + 1;
    public static int MAX_p = 64;
    public static int[][] grid = new int [SIZE][SIZE];

    public static void chack(int x, int y){
        for(int i = x; i < (x+8); i++){
            for(int j = y; j < (y+8); j++){
                grid[i][j]=1;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            chack(x[i] + OFFSET, y[i] + OFFSET);
        }
        // Please write your code here.
        int cnt = 0;
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                if(grid[i][j] == 1) cnt++;
            }
        }


        System.out.println(cnt);
    }
}