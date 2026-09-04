import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 2; i <= n; i++){
            int num = 0;

            for(int j = 2; j <= i; j++){
                if(i % j == 0 && i != j){
                    //System.out.println(i + " & " + j);
                    num = 0;
                    break;
                }else{
                    num = i;
                    //System.out.println("i" + i);
                }
            }

            if(num != 0) System.out.print(num + " ");
        }
    }
}