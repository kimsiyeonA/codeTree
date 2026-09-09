import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = 1;
        int[][] arr = new int [n][m];

        // int[] yx = {1 , -1};

        for(int j = 0; j < m ; j++){
            int startC = j;
            int r = 0;
            while(r < n && startC >=0){
                arr[r++][startC--] = num++;
            }
        }
        for(int i = 1; i < n ; i++){
            int startr = i;
            int C = m-1;
            while(startr < n && C >=0){
                arr[startr++][C--] = num++;
            }
        }
        //System.out.println(Arrays.deepToString(arr));

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}