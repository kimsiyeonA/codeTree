import java.util.Scanner;
public class Main {
    public static int OFFSET = 100;
    public static int MAX_M = OFFSET * 2 + 1;
    public static int[][] grid = new int [MAX_M][MAX_M];

    public static void check(int x1, int x2, int y1, int y2){
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                grid[i][j]++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();

            check(x1[i]+OFFSET , x2[i]+OFFSET, 
                 y1[i]+OFFSET, y2[i]+OFFSET);
        }
        // Please write your code here.

        int cnt = 0;

        for(int i = 0; i < MAX_M ; i++){
            for(int j = 0; j < MAX_M; j++){
                if(grid[i][j] >= 1) cnt++;
            }
        }

        System.out.println(cnt);
        
    }
}