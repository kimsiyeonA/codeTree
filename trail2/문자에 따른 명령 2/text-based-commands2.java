import java.util.Scanner;

public class Main {

    public static int len;
    public static char[] arr;

    // 북 동 남 서
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static int nx = 0, ny = 0, arrIdx = 0, dIdx = 0;

    public static int turnL(){
        return (dIdx - 1 + 4) % 4;
    }

    public static int turnR(){
        return (dIdx + 1) % 4;
    }

    public static void move(){
        nx = nx + dx[dIdx]; 
        ny = ny + dy[dIdx]; 
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        arr = s.toCharArray();
        len = arr.length;
        
        while (len-- > 0){
            char commend = arr[arrIdx++];
            if(commend == 'L') dIdx = turnL();
            else if (commend == 'R') dIdx = turnR();
            else move();
        }
        System.out.println(nx + " " + ny);

    }
}