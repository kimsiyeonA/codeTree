import java.util.Scanner;
public class Main {

    public static int x = 0, y = 0, cnt = 0;;
    
    // 서 남 북 동
    public static int[] dy = {0, -1, 1, 0};
    public static int[] dx = {1, 0, 0, -1};

    public static int changeDir(char dir){
        if (dir == 'W') return 0;
        else if (dir == 'S') return 1;
        else if (dir == 'N') return 2;
        else if (dir == 'E') return 3;
        return -1;
    }

    public static void changeDir(int idx, int dist){
        for(int i = 0; i < dist; i++){
            x += dx[idx];
            y += dy[idx];
            cnt++;
            //System.out.println(x + "..." + y);
            if(x == 0 && y == 0){
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] dir = new char[n];
        int[] dist = new int[n];
        for(int i = 0; i < n; i++){
            dir[i] = sc.next().charAt(0);
            dist[i] = sc.nextInt();

            int numDir = changeDir(dir[i]);
            changeDir(numDir, dist[i]);
            if(x == 0 && y == 0){
                break;
            }

        }
        // Please write your code here.

        if(x == 0 && y == 0) System.out.println(cnt);
        else  System.out.println(-1);
    }
}