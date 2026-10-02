import java.util.Scanner;
public class Main {

    public static int n;
    public static int[][] arr;

    // 상 하 좌 우
    public static int[] di = {-1, 1, 0, 0};
    public static int[] dj = {0, 0, -1, 1};

    public static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.

        int finalCnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int cnt = 0;
                for(int k = 0; k < 4; k++){
                    int ni = i + di[k];
                    int nj = j + dj[k];

                    if(inRange(ni,nj) && arr[ni][nj] == 1){
                        cnt++;
                    }
                }

                if(cnt >= 3) finalCnt++;

            }
        }
        System.out.println(finalCnt);

    }
}