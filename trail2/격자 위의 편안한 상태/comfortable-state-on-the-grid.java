import java.util.Scanner;

public class Main {

    public static int n, m;
    public static int[][] grid; 

    //  상 좌 하 우
    public static int[] di = {-1, 0, 1, 0};
    public static int[] dj = {0, -1, 0, 1};

    public static boolean inRange(int i, int j){
        return 0 <= i && i < n && 0 <= j && j < n; 
    }

    public static int sideCheck(int i, int j){
        int num = 0;
        for(int k = 0; k < 4; k++){
            int ni = i + di[k];
            int nj = j + dj[k];

            if(inRange(ni,nj)&&grid[ni][nj] == 1){
                num++;
            }

        }

        return num == 3 ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt(); // 행, 열
        grid = new int [n][n]; // 색칠할거임

        int m = sc.nextInt(); // 명형 횟수
        int[][] points = new int[m][2];
        
        for (int i = 0; i < m; i++) {
            points[i][0] = sc.nextInt() - 1;
            points[i][1] = sc.nextInt() - 1;

            int result = sideCheck(points[i][0], points[i][1]);
            System.out.println(result);

            grid[points[i][0]][points[i][1]] = 1;
        }

        // Please write your code here.
    }
}