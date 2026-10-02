import java.util.Scanner;
public class Main {

    // 서 남 북 동
    public static int[] dy = {0, -1, 1, 0};
    public static int[] dx = {-1, 0, 0, 1};

    public static int nx, ny;

    public static int move(char dir, int dis){
        int idx = -1;
        if(dir == 'W') idx = 0;
        else if (dir == 'S') idx = 1;
        else if (dir == 'N') idx = 2;
        else if (dir == 'E') idx = 3;
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nx = 0; ny = 0;
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            // Please write your code here.
            int idx = move(direction, distance);

            nx += (dx[idx] * distance);
            ny += (dy[idx] * distance);
        }
        System.out.println(nx + " " + ny);
    }
}