import java.util.Scanner;
public class Main {

    public static int R, C, cnt;
    public static char c;
    public static char[][] grid;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        // Please write your code here.

        c = grid[0][0];
        //boolean b = false;
        cnt = 0;
        int ans = 0;

        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {

                if (c != grid[i][j]){
                    c = grid[i][j];

                    for (int x = i+1; x < R - 1; x++) {
                        for (int y = j +1; y < C - 1; y++) {

                            if (c != grid[x][y] && grid[x][y] != grid[R-1][C-1] ){
                                //System.out.println(x + "..." + y + "...." + grid[x][y]);
                                cnt++;
                            }

                        }
                    }
                    c = grid[0][0];

                }

            }
        }

        System.out.println(cnt);
    }
}
