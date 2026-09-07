import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] fArr = new int [n][m];
        int[][] sArr = new int [n][m];
        int[][] cArr = new int [n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                fArr[i][j] = sc.nextInt();
            }
        } 

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sArr[i][j] = sc.nextInt();
            }
        }

        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(fArr[i][j] == sArr[i][j]) cArr[i][j]= 0;
                else cArr[i][j]= 1;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(cArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}