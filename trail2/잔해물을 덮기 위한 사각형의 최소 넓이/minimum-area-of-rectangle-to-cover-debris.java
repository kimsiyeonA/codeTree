import java.util.Scanner;

public class Main {
    public static int OFFSET = 1000;
    public static int MAX_G = OFFSET * 2 + 1;
    public static int[][] grid = new int [MAX_G][MAX_G];

    public static void chack(int x1, int x2, int y1, int y2, int k){
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                grid[i][j] = k;
            }
        }
    }

    public static int[] point(){
        int maxI = Integer.MIN_VALUE; int minI = Integer.MAX_VALUE;
        int maxJ = Integer.MIN_VALUE; int minJ = Integer.MAX_VALUE;

        for(int i = 0; i < MAX_G; i++){
            for(int j = 0; j < MAX_G; j++){
                if(grid[i][j] == 1){
                    if (maxI < i) maxI = i;
                    if (minI > i) minI = i;
                    if (maxJ < j) maxJ = j;
                    if (minJ > j) minJ = j;
                }
            }
        }

        int[] point = {maxI, minI, maxJ, minJ};
        return point;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();
        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();
        // Please write your code here.
        chack(rect1_x1 + OFFSET, rect1_x2 + OFFSET, rect1_y1 + OFFSET, rect1_y2 + OFFSET, 1);
        chack(rect2_x1 + OFFSET, rect2_x2 + OFFSET, rect2_y1 + OFFSET, rect2_y2 + OFFSET, 0);

        int[] point = point();

        // System.out.println(point[1]+"..."+point[0]+ "...+..."+ point[3]+"..."+point[2]);

        if(point[0] == Integer.MIN_VALUE || point[1] == Integer.MAX_VALUE) System.out.println(0);
        else        System.out.println((point[0] - point[1] + 1 )*(point[2] - point[3] + 1));
    }
}