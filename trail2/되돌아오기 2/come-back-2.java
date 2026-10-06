import java.util.Scanner;
public class Main {

    public static int x = 0, y = 0, dir = 0;
    // 북, 동, 남, 서
    public static int[] di = {1, 0, -1, 0};
    public static int[] dj = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        // Please write your code here.
        char[] arr = commands.toCharArray();
        int cnt = 0;
        for (int i = 0; i < arr.length; i++){
            char c = arr[i];

            if (c == 'R'){
                dir = (dir + 1) % 4;
            }else if (c == 'L'){
                dir = (dir + 3) % 4;
            }else{
                x += dj[dir];
                y += di[dir];
            }

            cnt++;
            if(x == 0 && y == 0) break;
        }

        if(x != 0 || y != 0) cnt = -1;

        System.out.println(cnt);
    }
}