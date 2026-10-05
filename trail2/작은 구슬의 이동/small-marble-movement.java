import java.util.Scanner;

public class Main {

    public static int N, T, R, C;
    public static int[][] arr;

    // 위 - - 아래 / - 좌 우 -
    public static int[] di = {-1, 0, 0, 1};
    public static int[] dj = {0, -1, 1, 0};

    /*
    1. 판에 공 위치 놓기
    2. 입력된 방향으로 공이동
    3. 공이 벽에 경계에 닿으면 방향 전환
    4. 최종 있는 곳은?
    */

    // 경계확인
    public static boolean inRange(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < N;
    }

    // 처음 방향 idx 반환
    public static int dirChange(char D) {
        int idx = -1;
        if (D == 'U') idx = 0;
        else if (D == 'L') idx = 1;
        else if (D == 'R') idx = 2;
        else if (D == 'D') idx = 3;
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 행, 열
        arr = new int[N][N]; // 구슬이 돌아다닐 판

        T = sc.nextInt(); // 시간 -> 초마다 이동

        R = sc.nextInt() - 1 ; // 공 위치 행,
        C = sc.nextInt() - 1; // 공 위치 열

        char D = sc.next().charAt(0); // 문자 ㅣ개
        // Please write your code here.
        int d = dirChange(D);

        for (int i = 0; i < T; i++) {
            // System.out.println(R + " " + C + " " + d+" "+i) ;
            int ni = R + di[d];
            int nj = C + dj[d];
            if (inRange(ni, nj)) {
                R = ni;
                C = nj;
            } else {
                d = 3 - d;
            }
        }

        System.out.println((R+1) + " " + (C+1));
    }
}
