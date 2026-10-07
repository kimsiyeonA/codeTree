import java.util.Scanner;

public class Main {

    // 왼쪽 위 오른쪽 아래
    public static int[] di = {0, -1, 0, 1};
    public static int[] dj = {-1, 0, 1, 0};

    public static int n, num, i, j;
    public static int dir = 0;

    public static int[][] grid;

    public static boolean inRange(int i, int j){
        return 0 <= i && i < n && 0 <= j && j < n;
    }

    public static void in(){
        grid[i][j] = num;

        while (true){
            if(num == 1) break;

            int ni = i + di[dir];
            int nj = j + dj[dir];

            if(inRange(ni, nj) && grid[ni][nj] == 0){
                grid[ni][nj] = --num;
                i = ni;
                j = nj;
            }else{
                dir = (dir + 1) % 4 ;
                continue;
            }

        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // Please write your code here.
        i = n-1; j = n-1; num = (n*n);
        grid = new int [n][n];

        in();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}