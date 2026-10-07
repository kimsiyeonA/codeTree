import java.util.Scanner;
public class Main {

    // 아래 오른족 위 왼쪽
    public static int[] di = {1, 0, -1, 0};
    public static int[] dj = {0, 1, 0, -1};

    public static int n, m;
    public static int i = 0, j = 0, num = 0, dir = 0;
    public static int[][] grid;

    public static boolean inRange(int i, int j){
        return 0 <= i && i < n && 0 <= j && j < m;
    }

    public static void in(){
        grid[i][j] = ++num;

        while(true){
            if(num == (n*m)) break;
            int ni = i + di[dir];
            int nj = j + dj[dir];
            
            //System.out.println(ni + "..." + nj + ".." + dir) ;
            if(inRange(ni, nj) && grid[ni][nj] == 0){
                grid[ni][nj] = ++num;
            }else{
                dir = (dir + 1) % 4;
                continue;
            }

            i = ni;
            j = nj;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 행
        m = sc.nextInt(); // 열
        // Please write your code here.
        grid = new int [n][m];

        in();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

    }
}