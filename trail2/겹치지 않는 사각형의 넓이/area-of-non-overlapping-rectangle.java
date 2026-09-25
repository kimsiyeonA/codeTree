import java.util.Scanner;
public class Main {
    public static int OFFSET = 1000;
    public static int MAX_N = OFFSET * 2 + 1;
    public static int[][] grid = new int [MAX_N][MAX_N];

    public static void checkGrid1 (int x1, int x2, int y1, int y2){
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                grid[i][j] = 1;
            }
        }
    }

    public static void checkGrid0 (int x1, int x2, int y1, int y2){
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                grid[i][j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();
        int mx1 = sc.nextInt();
        int my1 = sc.nextInt();
        int mx2 = sc.nextInt();
        int my2 = sc.nextInt();
        // Please write your code here.

        checkGrid1(ax1+OFFSET, ax2+OFFSET, ay1+OFFSET, ay2+OFFSET);
        checkGrid1(bx1+OFFSET, bx2+OFFSET, by1+OFFSET, by2+OFFSET);
        checkGrid0(mx1+OFFSET, mx2+OFFSET, my1+OFFSET, my2+OFFSET);

        int cnt = 0;

        for(int i = 0; i < MAX_N; i++){
            for(int j = 0; j < MAX_N; j++){
                if(grid[i][j] == 1) cnt++;
            }
        }

        System.out.println(cnt);
    }
}