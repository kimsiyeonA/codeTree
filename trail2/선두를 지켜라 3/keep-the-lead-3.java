import java.util.Scanner;
public class Main {
    public static int N = 1000;
    public static int V = 1000;
    public static int OFFSET = N * V + 1;

    public static int[] AArr = new int [OFFSET];
    public static int[] BArr = new int [OFFSET];
    public static char[] first = new char [OFFSET];
    public static int AIdx = 1, BIdx = 1;

    public static void moveA(int v, int t){
        for(int i = 1; i <= t; i++){
            AArr[AIdx] = AArr[AIdx - 1] + v;
            AIdx++;
        }
    }

    public static void moveB(int v, int t){
        for(int i = 1; i <= t; i++){
            BArr[BIdx] = BArr[BIdx - 1] + v;
            BIdx++;
        }
    }

    public static void whoFirst(){
        for(int i = 0; i < OFFSET; i++){
            if(i != 0 && AArr[i] == 0 && BArr[i] == 0) break;
            if(AArr[i] > BArr[i]) first[i] = 'A';
            else if (AArr[i] < BArr[i]) first[i] = 'B';
            else first[i] = 'S';
        }
    }

    public static void debug(int n){
        for(int i = 0; i < n; i++){
            System.out.print(AArr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(BArr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print(first[i] + " ");
        }
    }
    // public static int 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][2];
        int[][] b = new int[m][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            moveA(a[i][0], a[i][1]);
        }
        for (int i = 0; i < m; i++) {
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
            moveB(b[i][0], b[i][1]);
        }
        // Please write your code here.

        whoFirst();
        int cnt = 0;
        for(int i = 1; i < OFFSET; i++){
            if(first[i] == 0) break;
            if(first[i-1] != first[i]) cnt++;
        }

        //debug(18);
        System.out.println(cnt);
    }
}