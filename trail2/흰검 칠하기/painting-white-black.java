import java.util.Scanner;

public class Main {
    
    public static int MAX_N = 1000;
    public static int MAX_x = 100;
    public static int OFFSET = MAX_N * MAX_x;
    public static int startPoint = (OFFSET * 2 + 3) / 2 + 1;
    public static final int startPointSave = startPoint;

    public static int[] mainRange = new int [ OFFSET * 2 + 3];
    public static int[][] colorRange = new int [OFFSET * 2 + 3][2];
    public static char[] dir;

    // 검정 
    // colorRange[i][0]
    public static void moveR(int k, int x){
        // if(k != 0 && dir[k-1] == 'R') startPoint++;
        for(int i = 1; i <= x; i++){
            colorRange[startPoint][0] += 1;
            mainRange[startPoint++] = 1;
        }
        startPoint--;
    }

    // 흰색
    // colorRange[i][1]
    public static void moveL(int k, int x){
        // if(k != 0 && dir[k-1] == 'L') startPoint--;
        for(int i = 1; i <= x; i++){
            colorRange[startPoint][1] += 2;
            mainRange[startPoint--] = 2;
        }
        startPoint++;
    }

    public static void changeGray(){
        for(int i = 0; i < mainRange.length; i++){
            if((colorRange[i][0] + colorRange[i][1]) >= 6 && colorRange[i][0] >= 2 && colorRange[i][1] >= 4 )  mainRange[i] = 3;
        }
    }

    public static void debug(int a, int b){
        System.out.println("main");
        for(int i = a; i <= b; i++){
            System.out.print (mainRange[i] + "         ,");
        }
        System.out.println();


        System.out.println("color");
        for(int i = a; i <= b; i++){
            System.out.printf("b: %d w: %d ,",colorRange[i][0], colorRange[i][1]);
        }
        System.out.println();

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        dir = new char[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            dir[i] = sc.next().charAt(0);

            if(dir[i] == 'R'){
                moveR(i, x[i]);
            }else{
                moveL(i, x[i]);
            }
        }

        changeGray();

        int blackCnt = 0;
        int whiteCnt = 0;
        int grayCnt = 0;

        for(int i = 0; i < mainRange.length; i++){
            if(mainRange[i] == 1) blackCnt++;
            if(mainRange[i] == 2) whiteCnt++;
            if(mainRange[i] == 3) grayCnt++;
        }

        // debug(startPointSave-10, startPointSave+10);

        System.out.println(whiteCnt + " " + blackCnt + " " + grayCnt);
    }
}