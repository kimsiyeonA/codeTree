import java.util.Scanner;
public class Main {
    public static int[] range = new int [1000 * 2 + 3];
    public static int startPoint = 1002;
    public static char[] dirArr ;

    public static void moveR(int k, int x){
        if(k != 0 && dirArr[k-1] == 'R') startPoint++;
        for(int i = 0; i < x; i++){
            range[startPoint++]++;
        }
        startPoint--;
    }

    public static void moveL(int k, int x){
        if(k != 0 && dirArr[k-1] == 'L') startPoint--;
        for(int i = 0; i < x; i++){
            range[startPoint--]++;
        }
        startPoint++;
    }

    public static void debug(int x, int y){
        for(int i = x; i <= y; i++){
            System.out.print(range[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        dirArr = new char [N+1];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            dirArr[i] = sc.next().charAt(0);

            if(dirArr[i] == 'R'){
                moveR(i, x);
            }else{
                moveL(i, x);
            }

            // Please write your code here.
        }

        
        //debug(1002-15,1020);

        int cnt = 0;
        for(int i = 0; i < range.length;i++)
            if(range[i] > 1) cnt++;

        //System.out.println();
        System.out.println(cnt);
    }
}