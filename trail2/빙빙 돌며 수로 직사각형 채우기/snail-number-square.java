import java.util.Scanner;
public class Main {

    public static int n, m;
    public static int[][] grid;
    public static int i = 0, j = 0, dir = 0;

    //                        우  하  좌  상
    public static int[] di = {0,  1,  0, -1};
    public static int[] dj = {1,  0, -1,  0};


    public static boolean inRange(int i, int j){
        return 0 <= i && i < n && 0 <= j && j < m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 행
        m = sc.nextInt(); // 열
        // Please write your code here.
        grid = new int [n][m];

        grid[i][j] = 1;
       int cnt = 0;

        while(true){
            if(cnt == (n*m-1)) break;

            int ni = i + di[dir];
            int nj = j + dj[dir];

            if(inRange(ni, nj) && grid[ni][nj] == 0){
                grid[ni][nj] = grid[i][j]  + 1;
                cnt++;
            }else{
                dir = (dir + 1) % 4;
                continue;
            }
            // System.out.println(ni + " : " + nj + " " + cnt +  " " + dir);

            i = ni;
            j = nj;
        
        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }



    }
}