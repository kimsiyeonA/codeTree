import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cCnt = 0, lCnt = 0, tCnt = 0;

        for(int i = 1; i <= n; i++){
            if(i % 12 == 0){
                tCnt++;
                // System.out.println(i + " " +tCnt);
            }else {
                if(i % 3 == 0){
                    lCnt++;
                }else if(i % 2 == 0){
                    cCnt++;
                }
            }
        }

        System.out.println(cCnt + " " + lCnt + " " + tCnt);
    }
}