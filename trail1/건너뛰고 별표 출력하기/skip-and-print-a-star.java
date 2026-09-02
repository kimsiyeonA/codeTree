import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 1;

        for(int i = 1; i <= ((n*2)-1); i++){
            for(int j = 1; j <= cnt; j++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();

            if(i < n){
                cnt++;
            }else{
                cnt--;
            }
        }


    }
}