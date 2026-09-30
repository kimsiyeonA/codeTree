import java.util.Scanner;

public class Main {

    public static final int N = 1000;
    public static final int T = 1000;

    public static int[] aArr = new int [N*T+1];
    public static int[] bArr = new int [N*T+1];
    public static int aIdx = 1, bIdx = 1; 

    public static void move(int v, int t, char c){
        if(c == 'A'){
            for(int i = 1; i <= t; i++){
                aArr[aIdx] = aArr[aIdx - 1] + v;
                aIdx++;
            }
        }else{
            for(int i = 1; i <= t; i++){
                bArr[bIdx] = bArr[bIdx - 1] + v;
                bIdx++;
            }
        }
    }

    public static void debug(int n){
        for(int i = 0; i <= n; i++){
            System.out.print(aArr[i] + " ");
        }
         System.out.println();
        for(int i = 0; i <= n; i++){
            System.out.print(bArr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][2];
        for (int i = 0; i < n; i++) {
            A[i][0] = sc.nextInt(); // 이동
            A[i][1] = sc.nextInt(); // 시간마다

            move(A[i][0], A[i][1], 'A');
        }
        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();

            move(B[i][0], B[i][1], 'B');
        }
        // Please write your code here.

        int cnt = -1;


        char first = ' ';

        for(int i = 1; i < N*T; i++){
            if(aArr[i] == 0 || bArr[i] == 0) break;
            if(first != 'B' && aArr[i] < bArr[i]) {
                first = 'B';
                cnt++;
            }else if (first != 'A' && aArr[i] > bArr[i]) {
                first = 'A';
                cnt++;
            }
        }
        //debug(30);
        System.out.println(cnt);
    }
}