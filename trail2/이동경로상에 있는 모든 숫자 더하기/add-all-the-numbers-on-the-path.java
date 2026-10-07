import java.util.Scanner;

public class Main {

    public static int n, t, i, j;
    public static int  dir = 0;

    // 위 오른쪽 아래 왼쪽
    public static int[] di = {-1, 0, 1, 0};
    public static int[] dj = {0, 1, 0, -1};
    
    public static int[][] board;
    public static char[] cArr;

    public static boolean inRange(int i, int j){
        return 0 <= i && i < n && 0 <= j && j < n;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 행, 열
        board = new int[n][n];
        i = n/2; j = n/2;
        
        t = sc.nextInt();
        String commands = sc.next();
        cArr = commands.toCharArray();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int num = board[i][j];
        for(int k = 0; k < t ;k++){
            char c = cArr[k];

            if(c == 'R'){
                dir = (dir + 1) % 4;
            }else if(c == 'L'){
                dir = (dir + 3) % 4;
            }else{
                int ni = i + di[dir];
                int nj = j + dj[dir];

                if(inRange(ni,nj)){
                    num += board[ni][nj];
                    i = ni;
                    j = nj;
                }
               // System.out.println(ni + " " + nj + " : " + dir + " " + num ); // + " "+ board[ni][nj]
            }
        }

        System.out.println(num);
    }
}